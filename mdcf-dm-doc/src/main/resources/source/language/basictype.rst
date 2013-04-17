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

Basic type declarations allow one to specify available primitive types for
device attributes in models. All basic types should inherit from 
|BasicType|.


Built-in Types
**************

DML provides several built-in basic types:

* |Boolean| -- representing true or false values.
* |Number| -- representing number values.
* |IntegralType| -- representing whole number values.
* |Int| -- representing arbitrary-precision integer values.
* |Nat| -- representing arbitrary-precision non-negative integer values.

Note that they have the same simple name such as Scala 
:scalaapi:`Boolean <scala.Boolean>`, thus, they should not be confused.
 
Basic types can be organized to form sub-type hierarchy lattices.



Well-Formedness
***************
   