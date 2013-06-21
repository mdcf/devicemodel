.. include:: substitution.txt

.. _sec-feature-requirement:

Feature and Requirement
#######################

.. productionlist:: DMS
   feature             : `featureAnnotation`* ( "trait" | "final" "class" ) ID_feature 
                       :   "extends" ( "Feature" | `featureType` )
                       : "{" ( `attribute` [ "=" `initialization` ] )* "}"
                       : [ `invariantObject` ] 
   featureAnnotation   : `featureLevel` [ "(" <scalaExp : java.lang.String(S)> ")" ] 
                       : | "@Data" | "@Settable"
   featureLevel        : "@Schema" | "@Class" | "@Product"| "@Device" | "@Instance"
   featureType         : ID_feature ( "with" ID_feature )*
   attribute           : `attributeAnnotation`* [ "final" ] "val" ID_attribute ":" `type`
   attributeAnnotation : "override" | "@Data" | "@Settable"
                       : | "@Const" 
                       :      [ "(" `constLevel` 
                       :        | "value" "=" `constLevel` "," 
                       :          "qualifier" "=" <scalaExp : java.lang.String(S)> ")" ]
                       : | "@Multiplicity" "(" 
                       :      "lo" "=" <scalaExp : scala.Int(N)> 
                       :      [ "," "hi" "=" ( <scalaExp : scala.Int(N)> | "*" ) ] 
                       :      [ "," "clas" "=" "classOf" "[" <typeName> "]" ] ")" 
   constLevel          : "SCHEMA" | "CLASS" | "PRODUCT" | "INSTANCE" | "UNSPECIFIED"
   invariantObject     : "object" ID_feature "{" `invariant`* "}"
   invariant           : "@Inv" "val" ID_invariant ":" "Predicate" "[" `predicateType` "]" "="
                       :   "pred" "{" ID ":" `predicateType` "=>" <scalaExp : dms.Boolean> "}"
   predicateType       : `featureType`
                       : | "(" `featureType` ( "," `featureType` )+ ")"
   requirement         : [ "@Req" ]
                       : "trait" ID_requirement "{" `attribute`* "}"
                       : "object" ID_requirement "{" `invariant`* "}"

`Feature declarations <#grammar-token-feature>`__
are used to introduce compound types consisting of 
a set of named attributes for modeling parts or complete medical device 
features. `Attributes <#grammar-token-attribute>`__
are used to model information that may or must present in 
devices. Moreover, features can declare 
`invariants <#grammar-token-invariant>`__ over attribute values that 
express information consistency constraints. 
For example, the |Range| feature is used to model a number range 
information between ``min`` and ``max`` (inclusive), and an invariant that
states that ``min`` is less than or equal to ``max``. (Note that in Scala, 
backticks can delimit 
`unconventional identifiers <http://stackoverflow.com/questions/6576594/need-clarification-on-scala-literal-identifiers-backticks>`__).

`Requirement declarations <#grammar-token-requirement>`__ 
are used to introduce constraints for features that 
depend on other features, which are useful for medical device coordination.
For example, the |MyReqPulseOx| states a requirement for a pulse oximeter 
that has the specific SpO2 and pulse rate ranges.  


Feature
*******

Hierarchy
=========

Similar to basic types, feature sub-type hierarchy forms a lattice with 
|Feature| at the top. By allowing multiple feature inheritance 
(`featureType <#grammar-token-featureType>`__), one can mix-in
different features to put together larger device parts or complete device 
features. As stated in the 
:ref:`Well-Formedness <sec-feature-requirement-wf>` Section below, 
we avoid the dreaded 
`diamond problem <http://en.wikipedia.org/wiki/Multiple_inheritance#The_diamond_problem>`__
associated with multiple inheritance over feature attributes by disallowing it 
completely instead of allowing mitigations or workarounds.


Annotation
==========

Level
-----

DML (DMS) recognize `four main levels of features <#grammar-token-featureLevel>`__
for staging device type refinement and when constant attribute values 
should be provided:

* ``Schema`` (``@Schema``). In DMS, schema features are declared using |trait|.

* ``Class`` (``@Class``). In DMS, class features are declared using |trait|.

* ``Product``/``Device`` (``@Product``/``@Device``). ``Product`` and ``Device`` 
  differentiate device parts and complete devices, respectively. 
  In DMS, product features are declared using |trait|, while device features 
  are declared using ``final`` |class|.

* ``Instance`` (``@Instance``). In DML (DMS), instances are not represented as 
  they belong to a running |MDCF| instance.
  
At each level, one can add a |String| qualifier 
(``[ "(" <scalaExp : java.lang.String(S)> ")" ]``)
that indicates custom sub-levels within the provided four levels; by
default, the qualifier is an empty string (``""``).

In addition to specifying feature level at each feature declaration, one 
can dedicate a Scala/Java package for a particular level and annotate the 
package with ``@Schema``, ``@Class``, ``@Product``, or ``@Device`` 
instead.

Unfortunately, 
`Scala does not support annotation on packages <https://issues.scala-lang.org/browse/SI-3600>`__, 
thus, this should be done using Java's 
`package-info.java <http://docs.oracle.com/javase/specs/jls/se7/html/jls-7.html>`__ 
facility. For example, see the following package infos:

* :dmsjx:`dms.example.schema package-info.java <schema/package-info.java>`

* :dmsjx:`dms.example.class package-info.java <clas/package-info.java>`

* :dmsjx:`dms.example.device package-info.java <product/package-info.java>`

The package annotation scheme sets the default level for any feature declared in 
the package; this default can still be overriden by specifying the level in a
feature declaration.

If the feature or package level are not provided, the level is considered
as ``Unspecified``.


Data
----

The ``@Data`` annotation indicates that the declared feature's attributes 
form inter-device communication structures. Data features should not contain
``@Settable`` attributes or attributes whose type contains a ``@Settable`` 
feature. For example, see the various features in
:dmsx:`dms.example.schema.Schema.scala starting with the MetricAttribute feature <schema/Schema.scala#L114-115>`.


Settable
--------

The ``@Settable`` annotation indicates that the feature attribute values can
be assigned; by default, attribute values are read-only. Settable features
should not contain ``@Data`` or ``@Const`` attributes or attributes whose type
contains ``@Data`` or ``@Const``.
For example, see the various features in
:dmsx:`dms.example.schema.Schema.scala starting with the RangeSetting feature <schema/Schema.scala#L206-212>`.


Attribute
=========


As mentioned previously, `attributes <#grammar-token-attribute>`__ 
are used to model information stored in
devices. Attribute types can be either basic type, feature, or other compound
types such as a sequence or a set as described in the 
:ref:`sec-type-initialization` Section. Moreover, an attribute declaration can 
be accompanied with an initial attribute value. 

Attributes are inherited from super-types to their sub-types. 
A sub-type can :ref:`refine <sec-type-refinement>` the attribute type 
inherited from its super-type. However, no two or more attributes with the 
same name whose declaring features are different can be inherited 
(attribute refinements are considered as declarations).


Annotation
----------


In addition to ``@Data`` and ``@Settable`` similar to feature, attributes can
be `annotated <#grammar-token-featureAnnotation>`__ 
as overriding previously declared attribute (``override``), 
constants (``@Const``), or multiplity constraints (``@Multiplicity``) for
attributes whose type is a set and or a sequence. Note that ``override``
should be listed last to adhere to Scala's grammar. 



Override
^^^^^^^^


The override annotation expressed as a Scala modifier is used to indicate
that the declared attribute is a refinement of attributes that have been
declared by one of the feature's super-types. The |Extractor| auto-detects 
overriding attributes, however, it is strongly recommended that ``override`` is 
explicitly specified for documentation purpose and to prevent specification 
mistakes (e.g., typos) that inadvertently lead to introductions of new 
attributes instead of refining existing ones.

There are three reasons why one wants to override an attribute:

1. To :ref:`refine the attribute type <sec-type-refinement>` to be more
   specific; for example, see 
   :dmsx:`dms.example.schema.IntRange min and max <schema/Schema.scala#L31-32>`.

2. To assign an initial (or the constant) value; for example, see 
   :dmsx:`dms.example.clas.ICEPulseOx.type <clas/Class.scala#L16>`

3. To add multiplicity constraints; for example, see
   :dmsx:`dms.example.clas.ICEPulseOx.physioParams <clas/Class.scala#L18-20>`

 
Const
^^^^^


The constant annotation indicates that the attributes hold
non-changing information after they are initialized. The initialization
level (and sub-level qualifier) can be specified to enforce that the constant 
value is assigned at a specific level (and sub-level, if provided).
For example, see the ``type`` attribute of
:dmsx:`dms.example.schema.ICEDevice <schema/Schema.scala#L50-51>` that specifies
its constant value has to be provided at the ``Class`` level 
(without qualifier, which means at any sub-level before it is used in the
``Product``/``Device`` level). This is satisfied, for example, by the
:dmsx:`dms.example.clas.ICEPulseOx <clas/Class.scala#L16>` feature.
A declaration of a constant attribute with initialization should be 
declared as ``final``. 


Multiplicity
^^^^^^^^^^^^

For attribute whose type is a sequence or a set (collection), it may 
contain zero or more elements. 
DML (DMS) provide a specialized, lightweight construct useful for 
constraining the size of sequence/set. For example, see 
:dmsx:`dms.example.clas.ICEPulseOx.physioParams <clas/Class.scala#L18-20>`.
Each multiplicity constraint can specify the low and high bounds (inclusive)
for the number of elements in the sequence/set (as usual, the low bound
should be equal or less than the high bound); by default, the low bound
is ``0``, and the high bound is unbounded (``*``). 
In addition, one can specify the element type that is applicable for the 
multiplicity constraint. 
If specified, it means that the low and high bounds are on the 
number of elements whose type is a sub-type of the specified type. 
For example, the multiplicity constraint 
:dmsx:`dms.example.clas.ICEPulseOx.physioParams <clas/Class.scala#L18>`
specifies that ``dms.example.clas.ICEPulseOx.physioParams`` should at 
least have one :dmsx:`dms.example.clas.ICEPulseOx <clas/Class.scala#L39>`.
If the type is unspecified, then by default, it is 
:javadoc:`Object <java/lang/Object.html>`, which match any element type.

The multiplicity constraint can be expressed using a general invariant
construct (described below) such as the general invariants for 
:dmsx:`dms.example.clas.ICEPulseOx<clas/Class.scala#L26-36>`. 
However, using the annotation eases
the development of some tool support, for example, a tool that generates 
UML class diagrams. Thus, multiplicity constraints should be used 
first whenever possible instead of expressing them as general constraints.

.. _sec-feature-invariant:

Invariant
=========

`Invariant declarations <#grammar-token-invariant>`__
are used to state feature consistency constraints.
Instead of declaring them in the feature |trait| or |class|, invariants 
are declared in the feature |companion object| 
(`invariantObject <#grammar-token-invariantObject>`__).

Invariants are inherited from super types to their sub-types. However,
they are not allowed to be overriden. That is, a sub-type cannot
declare an invariant with the same name as with any of its super types'
invariants. The *effective* invariant of a feature is a conjunction of all
the invariants declared by the feature and all invariants inherited from
its super types.

In DMS, each invariant declaration is represented using a |val| that is
annotated with ``@Inv`` and whose type 
(`predicateType <#grammar-token-predicateType>`__) is a 
|Predicate| over the type of the feature (|Predicate| returns |Boolean|, i.e.,
not to be confused with :scalaapi:`scala.Boolean <scala.Boolean>`). 
For example,  
|range invariant| should have the type of a |Predicate| over |Range|, 
i.e., ``dms.Predicate[dms.example.schema.Range]``.

The invariant |val| should be initialized by calling the |pred| |macro|
that accepts a 
:scalaapi:`scala.Function1 <scala.Function1>` (that in turn, accepts  
a feature type object and returns a |Boolean| object). 
While any Scala expression returning a function
from the feature type to |Boolean| would be accepted, one should use
the :scala:`Scala anonymous function syntax <133>` variant as
described in the `invariant grammar <#grammar-token-invariant>`__. 

The body of the function (``<scalaExp : dms.Boolean>``) cannot depend 
on variables declared outside the function (i.e., no free variables are 
allowed). The exact expression language subset is not specified at this 
point in time. Currently, we are considering the following subset:

1. Attribute/field navigation, i.e., ``<scalaExp>.ID_attribute``.

2. Assigment of the form ``val ID = <scalaExp>``. 
   
3. Function application, where the function is a basic type 
   ``<basicOpMethod>`` or methods from compound types (e.g., set or 
   sequence methods).
   
4. :scala:`Pattern matching <120>`, where the matching is over type, e.g.,
   ``case x : PulseOx => <scalaExp>``. 
   
5. `Closure <http://www.tutorialspoint.com/scala/scala_closures.htm>`__.

As DML (DMS) are evolved, we will settle on the invariant expression 
language.

.. note:: The |pred| |macro| is used to retrieve the fully-resolved Scala 
          AST of the invariant function expression that works similarly to 
          :scalaapi:`scala.reflect.api.Universe <scala.reflect.api.Universe>`'s
          ``reify``; the difference is that |pred| enforces the 
          expression's type to be a function type returning |Boolean|. 
          The fully-resolved Scala AST is then retrieved by the 
          |Extractor| during model extraction process.


Representation Classes
======================

Below is a table that maps grammar productions related to feature and
its DML AST representation classes:

===========================================================================  ===========================================================================================================================
Grammar Non-Terminals                                                        DML AST Classes                                                          
===========================================================================  ===========================================================================================================================
`feature <#grammar-token-feature>`__                                         :dml:`dml.ast.Feature <ast/Feature.java>` with :dmldoc:`name <ast/Feature.html#name>` = fully-qualified name of the feature

`featureAnnotation <#grammar-token-featureAnnotation>`__                     :dml:`dml.ast.FeatureAnnotation <ast/FeatureAnnotation.java>`
            
                                                                             * :dml:`dml.ast.FeatureLevelAnnotation <ast/FeatureLevelAnnotation.java>`
                                                                             * :dml:`dml.ast.DataAnnotation <ast/DataAnnotation.java>`
                                                                             * :dml:`dml.ast.SettableAnnotation <ast/SettableAnnotation.java>`

`featureLevel <#grammar-token-featureLevel>`__                               :dml:`dml.ast.FeatureLevel <ast/FeatureLevel.java>`

`featureType <#grammar-token-featureType>`__                                 :dml:`dml.ast.NamedType <ast/NamedType.java>` (list of)

`attribute <#grammar-token-attribute>`__                                     :dml:`dml.ast.Attribute <ast/Attribute.java>`

`attributeAnnotation <#grammar-token-attributeAnnotation>`__                 :dml:`dml.ast.AttributeAnnotation <ast/AttributeAnnotation.java>`
            
                                                                             * :dml:`dml.ast.OverrideAnnotation <ast/OverrideAnnotation.java>`
                                                                             * :dml:`dml.ast.DataAnnotation <ast/DataAnnotation.java>`
                                                                             * :dml:`dml.ast.SettableAnnotation <ast/SettableAnnotation.java>`
                                                                             * :dml:`dml.ast.ConstAnnotation <ast/ConstAnnotation.java>`
                                                                             * :dml:`dml.ast.MultiplicityAnnotation <ast/MultiplicityAnnotation.java>`

`constLevel <#grammar-token-constLevel>`__                                   :dml:`dml.ast.FeatureLevel <ast/FeatureLevel.java>`

`invariantObject <#grammar-token-invariantObject>`__                         *not represented*; invariants stored directly in 
                                                                             :dml:`dml.ast.Feature <ast/Feature.java>`
                                                                             :dmldoc:`members <ast/Feature.html#members>`

`invariant <#grammar-token-invariant>`__                                     :dml:`dml.ast.Invariant <ast/Invariant.java>`
===========================================================================  ===========================================================================================================================

Currently, :dml:`dml.ast.Invariant <ast/Invariant.java>` 
:dmldoc:`predicates <ast/Invariant.html#predicate>`
are not represented using custom DML AST classes 
(the :dmldoc:`predicate <ast/Invariant.html#predicate>` type is 
:javadoc:`java.lang.Object <java/lang/Object.html>`);
the :dmldoc:`predicate <ast/Invariant.html#predicate>` is currently
represented using 
:scalaapi:`Scala scala.reflect.api.Trees types <scala.reflect.api.Trees>`.
As DML (DMS) expression language is evolved, we will introduce custom
AST classes for representing predicates.
 

Symbol Table
============

There are several methods provided by the symbol table API related to 
features. Below is the list of relevant methods (please see the documentation
in the |SymbolTable| that describes the methods):

* :dmldoc:`features <symbol/SymbolTable.html#features()>` 

* :dmldoc:`feature <symbol/SymbolTable.html#feature(java.lang.String)>` 

* :dmldoc:`featureOpt <symbol/SymbolTable.html#featureOpt(java.lang.String)>`
 
* :dmldoc:`all... <symbol/SymbolTable.html#allAttributeMap(java.lang.Iterable)>`

* :dmldoc:`declarationMap <symbol/SymbolTable.html#declarationMap()>`

* :dmldoc:`declarationNames <symbol/SymbolTable.html#declarationNames()>`

* :dmldoc:`declared... <symbol/SymbolTable.html#declaredAttributeMap(java.lang.String)>`

* :dmldoc:`isFeature <symbol/SymbolTable.html#isFeature(java.lang.String)>`

* :dmldoc:`isSubTypeOf <symbol/SymbolTable.html#isSubTypeOf(java.lang.String,%20java.lang.String)>`

* :dmldoc:`isSuperTypeOf <symbol/SymbolTable.html#isSuperTypeOf(java.lang.String,%20java.lang.String)>`

* :dmldoc:`kind <symbol/SymbolTable.html#kind(java.lang.String)>`

* :dmldoc:`kindOpt <symbol/SymbolTable.html#kindOpt(java.lang.String)>`

* :dmldoc:`subTransitiveMap <symbol/SymbolTable.html#subTransitiveMap()>`

* :dmldoc:`superTransitiveMap <symbol/SymbolTable.html#superTransitiveMap()>`


Requirement
***********

`Requirements <#grammar-token-requirement>`__ are used to express 
dependency constraints for medical device coordinations. That is, if a 
device requires some features from other devices with some specific 
properties, the device can advertise the properties as requirements.
 
A `requirement <#grammar-token-requirement>`__ consists of attributes and 
invariants that state the required feature properties. 
The form of a requirement invariant 
is similar to :ref:`feature`s invariant <sec-feature-invariant>`, except
that a requirement invariant predicate function is allowed to work over
a tuple of feature types 
(`predicateType <#grammar-token-predicateType>`__: 
``"(" `featureType` ( "," `featureType` )+ ")"``).


Representation Classes
======================

Requirements are represented using the 
:dml:`dml.ast.Requirement <ast/Requirement.java>` AST class 
(with :dmldoc:`name <ast/Requirement.html#name>` = fully-qualified
name of the requirement) and requirement invariant is represented using
:dml:`dml.ast.Invariant <ast/Invariant.java>` similar to a feature
invariant.  


Symbol Table
============

There are several methods provided by the symbol table API related to 
requirements. Below is the list of relevant methods (please see the 
documentation in the |SymbolTable| that describes the methods):

* :dmldoc:`requirements <symbol/SymbolTable.html#requirements()>` 

* :dmldoc:`requirement <symbol/SymbolTable.html#requirement(java.lang.String)>` 

* :dmldoc:`requirementOpt <symbol/SymbolTable.html#requirementOpt(java.lang.String)>`
 
* :dmldoc:`declarationMap <symbol/SymbolTable.html#declarationMap()>`

* :dmldoc:`declarationNames <symbol/SymbolTable.html#declarationNames()>`

* :dmldoc:`isRequirement <symbol/SymbolTable.html#isRequirement(java.lang.String)>`

* :dmldoc:`kind <symbol/SymbolTable.html#kind(java.lang.String)>`

* :dmldoc:`kindOpt <symbol/SymbolTable.html#kindOpt(java.lang.String)>`


.. _sec-feature-requirement-wf:

Well-Formedness
***************

