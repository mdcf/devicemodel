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

Well-Formedness
***************
   