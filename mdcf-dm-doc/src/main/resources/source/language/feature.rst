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
   attribute           : `attributeAnnotation`* "val" ID_attribute ":" `type`
   attributeAnnotation : "@Data" | "@Settable" 
                       : | "@Const" 
                       :     [ "(" `constLevel` 
                       :           | "value" "=" `constLevel` "," 
                       :             "qualifier" "=" <scalaExp : java.lang.String(S)> ")" ]
                       : | "@Multiplicity" "(" "lo" "=" <scalaExp : scala.Int(N)> "," 
                       :                       "hi" "=" ( <scalaExp : scala.Int(N)> | "*" ) 
                       :                       [ "," "clas" "=" "classOf" "[" <typeName> "]" ] ")" 
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
devices at design-time, assembly-time, configuration-time, 
coordination initialization-time, and at runtime. Moreover, features can declare 
invariants over attribute values that express information consistency 
constraints.

Requirement declarations are used to introduce constraints for features that 
depend on other features, which are useful for medical device coordination.


Feature
*******

Hierarchy
=========

Similar to basic types, feature sub-type hierarchy forms a lattice with 
|Feature| at the top. By allowing multiple feature inheritance, one can mix-in
different features to put together complete device features. As stated in 
the :ref:`Well-Formedness <sec-feature-wf>` Section below, 
we avoid the dreaded `diamond problem <http://en.wikipedia.org/wiki/Multiple_inheritance#The_diamond_problem>`__
associated with multiple inheritance over feature attributes by disallowing it 
completely instead of allowing mitigations or workarounds.


Annotation
==========

Level
-----

DML (DMS) recognize four levels of features for staging when constant attribute 
values have to be provided:

* Schema (``@Schema``). In DMS, schema features are declared using |trait|.

* Class (``@Class``). In DMS, class features are declared using |trait|.

* Product/Device (``@Product``/``@Device``). Product and Device are 
  differentiate device parts and complete devices, respectively. 
  In DMS, product features are declared using |trait|, while device features 
  are declared using ``final`` |class|.

* Instance (``@Instance``). In DMS, instances are not represented as they belong
  to a running |MDCF| instance.
  
At each level, one can add a |String| qualifier that indicates custom sub-levels 
within the provided four levels.

In addition to specifying feature level per feature declaration, one can 
dedicate a Scala/Java package for the level and annotate the package with
``@Schema``, ``@Class``, ``@Product``, and ``@Device`` instead.

Unfortunately, 
`Scala does not support annotating packages <https://issues.scala-lang.org/browse/SI-3600>`__, 
thus, this should be done using Java's 
`package-info.java <http://docs.oracle.com/javase/specs/jls/se7/html/jls-7.html>`__ 
facility. For examples, see the following package infos:

* :dmsjx:`dms.example.schema package-info.java <schema/package-info.java>`

* :dmsjx:`dms.example.class package-info.java <clas/package-info.java>`

* :dmsjx:`dms.example.device package-info.java <device/package-info.java>`

The package annotation scheme sets the default level for any feature declared in 
the package; this default can still be be overriden by specifying the level in a
feature declaration.


Data
----


Settable
--------


Attribute
=========

Annotation
----------

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

