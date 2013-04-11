Language Specification and Representation
=========================================

.. productionlist:: DMS
   model               : `package` `imports` `declaration`*
   package             : "package" ( ID "." )* ID
   imports             : `importdms` `import`*
   importdms           : "import" "edu" "." "ksu" "." "cis" "." "santos" "." "mdcf" "." "dms" "." "_"
   import              : "import" ( ID "." )* ID [ "." "_" ]
   declaration         : `basicType` | `feature` | `requirement`

.. productionlist:: DMS
   basicType           : `basicTypeTrait`
                       : | `basicTypeClass` `basicTypeObject`
   basicTypeTrait      : "trait" ID_basic "extends" ( "BasicType" | ID_basic ) [ `basicTypeBody` ]
   basicTypeClass      : [ `basicTypeModifier` ] [ "final" ] 
                       : "class" ID_basic "(" "val" "value" ":" <basicInternalType> ")"
                       : "extends" ( "BasicType" | ID_basic ) [ `basicTypeBody` ]
   basicTypeModifier   : "@Schema" | "@Class" | "@Product" | "@Instance"
   basicTypeObject     : "object" ID_basic "{" `basicTypeApply` "}"
   basicTypeApply      : "implicit" "def" "apply" "(" ID_apply ":" basicInternalType ")" "=" 
                       : "new" ID_basic "(" ID_apply ")"
   basicTypeBody       : "{" [ `basicAsStringMethod` ] [ `basicToStringMethod` ] <basicOpMethod>* "}"
   basicAsStringMethod : "override" "def" "asString" "=" <scalaExp : java.lang.String>
   basicToStringMethod : "override" "def" "toString" "=" <scalaExp : java.lang.String>

.. productionlist:: DMS
   feature             : [ featureModifier ] ( "trait" | "class" ) ID_feature 
                       : "extends" ( "Feature" | `featureType` )
                       : "{" ( `attribute` [ `initialization` ] )* "}"
                       : [ `invariantObject` ] 
   featureModifier     : "@Schema" | "@Class" | "@Product" | "@Instance" | "@Data" | "@Settable"
   featureType         : ID_feature ( "with" ID_feature )*
   attribute           : [ `attributeModifier` ] "val" ID_attribute ":" `type`
   attributeModifier   : "@Data" | "@Settable" | "@Const" [ "(" `constMode` ")" ] 
   constMode           : "SCHEMA" | "CLASS" | "PRODUCT" | "INSTANCE" | "UNSPECIFIED"
   invariantObject     : "object" ID_feature "{" `invariant`* "}"
   invariant           : "@Inv" "val" ID_invariant ":" "Predicate" "[" `predicateType` "]" "="
                       : "pred" "{" ID ":" `predicateType` "=>" <scalaExp : Boolean> "}"
   predicateType       : `featureType`
                       : | "(" `featureType` ( "," `featureType` )+ ")"
   requirement         : "@Req" "object" ID_requirement "{" `invariant`* "}"

.. productionlist:: DMS
   type                : "Any" 
                       : | "Boolean" 
                       : | "Number" | "IntegralType" | "Int" | "Nat"
                       : | "String"
                       : | ID_basic 
                       : | "Option" "[" `type` "]" 
                       : | "Either" "[" `type` "," `type` "]"
                       : | "(" `type` ( "," `type` )+ ")" 
                       : | "Seq" "[" `type` "]" 
                       : | "Set" "[" `type` "]"
                       : | `featureType` [ "{" `attribute`* "}" ]
   initialization      : "true" | "false"
                       : | <scalaExp : Int>
                       : | <scalaExp : java.lang.String> 
                       : | "None" | "Some" "(" `initialization` ")"
                       : | "Left" "(" `initialization` ")" | "Right" "(" `initialization` ")"
                       : | "(" `initialization` ( "," `initialization` )+ ")"
                       : | "Seq" "(" [ `initialization` ( "," `initialization` )* ] ")"
                       : | "Set" "(" [ `initialization` ( "," `initialization` )* ] ")"
                       : | "new" `featureType` [ "{" `attributeInit` "}" ]
   attributeInit       : [ ( `attributeModifier` | "override" ) ] "val" ID_attribute ":" `type` "=" `initialization`
