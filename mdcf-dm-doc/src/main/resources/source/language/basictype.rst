.. include:: substitution.txt

Basic Type
##########

.. productionlist:: DMS
   basicType           : `basicTypeTrait` | `basicTypeClass` `basicTypeObject`
   basicTypeTrait      : "trait" ID_basic 
                       : "extends" ( "BasicType" | ID_basic ( "with" ID_basic )* ) 
                       : [ `basicTypeBody` ]
   basicTypeClass      : [ "final" ] "class" ID_basic "(" "val" "value" ":" <basicInternalType> ")"
                       : "extends" ( "BasicType" | ID_basic ( "with" ID_basic )* ) 
                       : [ `basicTypeBody` ]
   basicTypeObject     : "object" ID_basic "{" `basicTypeApply` "}"
   basicTypeApply      : "implicit" "def" "apply" "(" ID_apply ":" <basicInternalType> ")" "=" 
                       : "new" ID_basic "(" ID_apply ")"
   basicTypeBody       : "{" [ `basicAsStringMethod` ] [ `basicToStringMethod` ] <basicOpMethod>* "}"
   basicAsStringMethod : "override" "def" "asString" "=" <scalaExp : java.lang.String>
   basicToStringMethod : "override" "def" "toString" "=" <scalaExp : java.lang.String>


Basic types are primitive types for device attributes in models. 
DML (DMS) provides one built-in basic type and that is ``Boolean`` (|Boolean|),
which represents true and false values. Note that it has the same simple name to 
:scalaapi:`scala.Boolean <scala.Boolean>` that is imported by default in 
any Scala code; thus, they should not be confused. Using 
``import edu.ksu.cis.santos.mdcf.dms._`` as recommended in the 
:ref:`Model <sec-model>` Section override the default import and
made all references to ``Boolean`` refer to |Boolean| instead of 
:scalaapi:`scala.Boolean <scala.Boolean>`. 


Basic types can be organized in a sub-type (|subtypeof|) hierarchy such as 
|Nat| |subtypeof| |Int| |subtypeof| |IntegralType| |subtypeof| |Number|
|subtypeof| |BasicType|. 
In general, basic types can be organized to form a sub-type hierarchy lattice 
instead of just a tree rooted at |BasicType|.
That is, user-defined basic types can inherit from one or more basic types.


Basic type declarations allow one to declare additional types.
All basic types inherit from |BasicType|.



Implementation Classes and Construction
***************************************


Well-Formedness
***************
   
The set of basic types in models are well-formed if:

1. For each basic type, each of its super types is either another
   basic type or |BasicType|.

2. There is no circularity in the basic type subtype hierarchy.

In DMS, the |Extractor| enforces the first rule; more precisely, 
it only recoqnizes a Scala type as a basic type if it is a descendant of 
|BasicType|. 
The second rule is enforced by the Scala compiler.
 