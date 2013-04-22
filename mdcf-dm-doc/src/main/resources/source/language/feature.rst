.. include:: substitution.txt

.. _sec-feature-requirement:

Feature and Requirement
#######################

.. productionlist:: DMS
   feature             : `featureAnnotation`* ( "trait" | "final" "class" ) ID_feature 
                       :   "extends" ( "Feature" | `featureType` )
                       : "{" ( `attribute` [ `initialization` ] )* "}"
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
                       :   "pred" "{" ID ":" `predicateType` "=>" <scalaExp : Boolean> "}"
   predicateType       : `featureType`
                       : | "(" `featureType` ( "," `featureType` )+ ")"
   requirement         : "@Req" "object" ID_requirement "{" `invariant`* "}"

Feature declarations are used to introduce compound types consisting of 
a set of named attributes for modeling parts or complete medical device 
features. Attributes are used to model information that may or must present in 
devices. Moreover, features can declare invariants over attribute values that 
express information consistency constraints. 
For example, the :dmsx:`dms.example.schema.Range <schema/Schema.scala#L14-28>` 
feature is used to model a number range information between ``min``
and ``max`` (inclusive), and an invariant that states that ``min`` is less than
or equal to ``max``. (Note that in Scala, backticks can delimit 
`unconventional identifiers <http://stackoverflow.com/questions/6576594/need-clarification-on-scala-literal-identifiers-backticks>`__).

Requirement declarations are used to introduce constraints for features that 
depend on other features, which are useful for medical device coordination.
For example, the 
:dmsx:`dms.example.requirement.MyReqPulseOx <requirement/App.scala#L15-38>`
states a requirement for a pulse oximeter that has the specific SpO2 
and pulse rate ranges.  


Feature
*******

Hierarchy
=========

Similar to basic types, feature sub-type hierarchy forms a lattice with 
|Feature| at the top. By allowing multiple feature inheritance 
(`featureType <#grammar-token-featureType>`__), one can mix-in
different features to put together larger device parts or complete device 
features. As stated in the :ref:`Well-Formedness <sec-feature-wf>` Section below, 
we avoid the dreaded `diamond problem <http://en.wikipedia.org/wiki/Multiple_inheritance#The_diamond_problem>`__
associated with multiple inheritance over feature attributes by disallowing it 
completely instead of allowing mitigations or workarounds.


Annotation
==========

Level
-----

DML (DMS) recognize four main levels of features for staging device type 
refinement and when constant attribute values should be provided:

* ``Schema`` (``@Schema``). In DMS, schema features are declared using |trait|.

* ``Class`` (``@Class``). In DMS, class features are declared using |trait|.

* ``Product``/``Device`` (``@Product``/``@Device``). ``Product`` and ``Device`` 
  differentiate device parts and complete devices, respectively. 
  In DMS, product features are declared using |trait|, while device features 
  are declared using ``final`` |class|.

* ``Instance`` (``@Instance``). In DML (DMS), instances are not represented as 
  they belong to a running |MDCF| instance.
  
At each level, one can add a |String| qualifier that indicates custom sub-levels 
within the provided four levels.

In addition to specifying feature level at each feature declaration, one can 
dedicate a Scala/Java package for a particular level and annotate the package 
with ``@Schema``, ``@Class``, ``@Product``, or ``@Device`` instead.

Unfortunately, 
`Scala does not support annotation on packages <https://issues.scala-lang.org/browse/SI-3600>`__, 
thus, this should be done using Java's 
`package-info.java <http://docs.oracle.com/javase/specs/jls/se7/html/jls-7.html>`__ 
facility. For example, see the following package infos:

* :dmsjx:`dms.example.schema package-info.java <schema/package-info.java>`

* :dmsjx:`dms.example.class package-info.java <clas/package-info.java>`

* :dmsjx:`dms.example.device package-info.java <device/package-info.java>`

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


As mentioned previously, attributes are used to model information stored in
devices. Attribute types can be either basic type, feature, or other compound
types such as a sequence or a set as described in the 
:ref:`sec-type-initialization` Section. Moreover, an attribute declaration can 
be accompanied with an initial attribute value. 


Annotation
----------


In addition to ``@Data`` and ``@Settable`` similar to feature, attributes can
be annotated as overriding previously declared attribute (``override``), 
constants (``@Const``), or multiplity constraints (``@Multiplicity``) for
attributes whose type is a set and or a sequence.


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
   :dmsx:`dms.example.schema.IntRange <schema/Schema.scala#L31-32>`.

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


Invariant
=========


Representation Classes
======================


Symbol Table
============

.. _sec-feature-wf:


Well-Formedness
===============

Requirement
***********

Invariant
=========

Representation Classes
======================


Symbol Table
============


Well-Formedness
===============

