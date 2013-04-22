.. include:: substitution.txt

.. _sec-basictype: 

Basic Type
##########

.. productionlist:: DMS
   basicType           : ( `basicTypeTrait` | `basicTypeClass` ) [ `basicTypeObject` ]
   basicTypeTrait      : "trait" ID_basic 
                       :   "extends" ( "BasicType" | ID_basic ( "with" ID_basic )* ) 
                       : [ `basicTypeBody` ]
   basicTypeClass      : [ "final" ] "class" ID_basic "(" "val" "value" ":" <basicInternalType> ")"
                       :   "extends" ( "BasicType" | ID_basic ( "with" ID_basic )* ) 
                       : [ `basicTypeBody` ]
   basicTypeBody       : "{" [ `basicAsStringMethod` ] [ `basicToStringMethod` ] <basicOpMethod>* "}"
   basicAsStringMethod : "override" "def" "asString" "=" <scalaExp : java.lang.String>
   basicToStringMethod : "override" "def" "toString" "=" <scalaExp : java.lang.String>
   basicTypeObject     : "object" ID_basic "{" `basicTypeApply` <basicTypeApplyOther>* "}"
   basicTypeApply      : "implicit" "def" "apply" "(" ID_apply ":" <basicInternalType> ")" "=" 
                       :   "new" ID_basic "(" ID_apply ")"


Basic types are primitive types for model device attributes whose values are
*immutable*.
In DML, all basic types have to be explicitly declared before other model entities 
can refer to it. In DMS, explicit declaration basic types 
separate the types in the modeling type universe with that of Scala's;
in other words, they draw the boundaries of Scala types available that are 
imported as primitive types for modeling.

Built-in Type
*************

DML (DMS) provides only one built-in basic type and that is ``Boolean`` 
(|Boolean|) -- representing the typical true and false values; this is provided
because :ref:`invariant <sec-feature-requirement>` |Predicate| uses it. 
Note that it has the same simple name to 
:scalaapi:`scala.Boolean <scala.Boolean>` that is imported by default in 
any Scala code; thus, they should not be confused. Using 
``import edu.ksu.cis.santos.mdcf.dms._`` as recommended in the 
:ref:`Model <sec-model>` Section overrides the default import and
made all references to ``Boolean`` refer to |Boolean| instead of 
:scalaapi:`scala.Boolean <scala.Boolean>`. 
Similarly, this default overriding is recommended for |Number| (overriding
:javadoc:`java.lang.Number <java/lang/Number.html>`) and |Int| (overriding
:scalaapi:`scala.Int <scala.Int>`). 

Hierarchy
*********

Basic types can be organized in a sub-type (|subtypeof|) hierarchy such as 
|Nat| |subtypeof| |Int| |subtypeof| |IntegralType| |subtypeof| |Number|
|subtypeof| |BasicType|. 
In general, basic types can be organized to form a sub-type hierarchy lattice 
instead of just a tree rooted at |BasicType|.
That is, user-defined basic types can inherit from one or more basic types.


Declaration
***********

In DMS, a basic type can be declared as a Scala |trait|
(e.g., |Number|) or |class| (e.g., |Int|), and optionally, accompanied by
a |companion object|. (One can optionally use an ``abstract`` |class| instead of
|trait| to enforce more type structure.)
Regardless, the declared basic type should inherit from either |BasicType| 
directly or other basic types. As a |class|, the basic type is required to
implement (or inherit implementation of) "abstract" methods declared in 
|BasicType| such as |basic type value|, which can hold any Scala type 
internally. 
In the grammar, this is satisfied by declaring a |val| named ``value`` in a 
|class|' constructor. Thus, a basic declaration can be viewed as simply a
wrapper type for existing type (``<basicInternalType>``)
that is exported to the modeling type universe.


Operations
**********

In addition, a basic type declaration can override |BasicType| methods such as:

* |basic asString|, which produces a |String| representation
  (``<scalaExp: java.lang.String>``) of the "wrapped" internal ``value`` of the 
  basic type instance. By default, it is implemented as simply 
  calling the ``toString`` method of the internal ``value``. One can override
  this method if the ``value``'s ``toString`` method does not give the 
  expected behavior such as the case for |Int|.   

* |basic toString|, which produces a |String| representation for, for example,
  debugging purposes. By default, it gives a |String| consisting of 
  the basic type name appended with the result of its |basic asString| wrapped 
  in a parenthesis (e.g., ``...Int(0)``).

Furthermore, one can additionally declare *pure* operations on basic types as 
Scala methods (``<basicOpMethod>``) to export available operations on basic type 
values that are useful, for example, for stating 
:ref:`invariant <sec-feature-requirement>` over device model attribute values. 
The *pure* qualifier means that they are non-side-effecting value operations 
(recall that DML basic type values are immutable). 
The reader is referred to |Boolean|, |Number|, |Int|, and |Nat| for
examples of ``<basicOpMethod>``.  


Factory and Implicit Conversion
*******************************

In the companion object for a basic type, one can provide |implicit| factory 
methods as |apply| methods to ease attribute 
:ref:`initialization <sec-type-initialization>` 
(`basicTypeApply <#grammar-token-basicTypeApply>`__ and 
``<basicTypeApplyOther>``).  

To illustrate implicit conversion, consider a 
:ref:`feature <sec-feature-requirement>`
:dmdocs:`example <ExsBasicType.scala>` below:

.. literalinclude:: /../../scala/ExsBasicType.scala
   :language: scala
   :emphasize-lines: 5
   :linenos:

At :dmdocs:`line 5 <ExsBasicType.scala\#L5>`, the |val| ``foo`` is declared to
be of type |Int|; note that the type of the literal ``5`` is 
:scalaapi:`scala.Int <scala.Int>`, thus, there seems to be a type mismatch.
In this situation, the Scala compiler looks up an |implicit| method that can 
convert :scalaapi:`scala.Int <scala.Int>` to |Int| in the |Int| companion 
object; in this case, it found that it can use |Int| ``apply``. 
Thus, the compiler automatically inserts the call to ``apply`` before assigning
to ``foo`` so the resulting compiled code is equivalent to the following
:dmdocs:`example <ExsBasicTypeApply.scala>`:

.. literalinclude:: /../../scala/ExsBasicTypeApply.scala
   :language: scala
   :emphasize-lines: 5
   :linenos:
  
One needs to be careful to always explicitly type attribute ``val``; failing to
do so gives result to an unexpected type as illustrated in the 
:dmdocs:`example <ExsBasicTypeExplicit.scala>` below.

.. literalinclude:: /../../scala/ExsBasicTypeFail.scala
   :language: scala
   :emphasize-lines: 5
   :linenos:  
   
At :dmdocs:`line 5 <ExsBasicTypeExplicit.scala#L5>`, the Scala compiler infers
the type of ``foo`` to be :scalaapi:`scala.Int <scala.Int>`. When extracted,
the |Extractor| will gives an error indicating that ``foo``'s type is not
allowed as it is not in the modeling type universe.

The grammar recommendeds that there is at least one implicit
factory method that converts the basic type's ``<basicInternalType>`` to
the basic type. Alternatively, in the lack of such |implicit| factory method, 
one can create the basic type value explicitly as shown in the 
example below (note that when explicitly creating a basic type value, one can 
optionally leave out to explicitly give a type of an attribute ``val``):
 
.. literalinclude:: /../../scala/ExsBasicTypeExplicit.scala
   :language: scala
   :emphasize-lines: 5
   :linenos:


Representation Classes
**********************

Basic type declarations are represented using the 
:dml:`dml.ast.BasicType <ast/BasicType.java>` AST class. A basic type can be
referred by its fully qualified named stored in  
:dmldoc:`BasicType.name <ast/BasicType.html#name>` (inherited from
:dmldoc:`Declaration.name <ast/Declaration.html#name>`)
using the :dml:`dml.ast.NamedType <ast/NamedType.java>`
AST class as can be observed how
:dml:`dml.ast.BasicType <ast/BasicType.java>` refers to its super basic types in 
:dmldoc:`supers <ast/BasicType.html#supers>`.
Attribute :ref:`initialization <sec-type-initialization>` whose type is a basic
type is represented using the 
:dml:`dml.ast.BasicInit <ast/BasicInit.java>` AST class, which stores the 
basic type internal |String| value in
:dml:`dml.ast.BasicInit <ast/BasicInit.java>`  
:dmldoc:`value <ast/BasicInit.html#value>` 
(the |String| value is retrieved from |BasicType| |basic asString| discussed
previously).  


Symbol Table
************

There are several methods provided by the symbol table API related to basic
types. Below is the list of relevant methods (please see the documentation
in the |SymbolTable| that describes the methods):

* :dmldoc:`basicTypes <symbol/SymbolTable.html#basicTypes()>` 

* :dmldoc:`basicType <symbol/SymbolTable.html#basicType(java.lang.String)>`

* :dmldoc:`basicTypeOpt <symbol/SymbolTable.html#basicTypeOpt(java.lang.String)>` 

* :dmldoc:`declarationMap <symbol/SymbolTable.html#declarationMap()>`

* :dmldoc:`declarationNames <symbol/SymbolTable.html#declarationNames()>`

* :dmldoc:`isBasicType <symbol/SymbolTable.html#isBasicType(java.lang.String)>`

* :dmldoc:`isSubTypeOf <symbol/SymbolTable.html#isSubTypeOf(java.lang.String,%20java.lang.String)>`

* :dmldoc:`isSuperTypeOf <symbol/SymbolTable.html#isSuperTypeOf(java.lang.String,%20java.lang.String)>`

* :dmldoc:`kind <symbol/SymbolTable.html#kind(java.lang.String)>`

* :dmldoc:`kindOpt <symbol/SymbolTable.html#kindOpt(java.lang.String)>`

* :dmldoc:`subTransitiveMap <symbol/SymbolTable.html#subTransitiveMap()>`

* :dmldoc:`superTransitiveMap <symbol/SymbolTable.html#superTransitiveMap()>`



Well-Formedness
***************
   
The set of basic types in models are well-formed if:

1. For each basic type, each of its super types is either another
   basic type or |BasicType|.

2. There is no circularity in the basic type subtype hierarchy.

In DMS, the |Extractor| enforces the first rule; more precisely, 
it only recoqnizes a Scala type as a basic type if it is a descendant of 
|BasicType| (and not a descendant of |Feature|). 
The second rule is enforced by the Scala compiler.
 