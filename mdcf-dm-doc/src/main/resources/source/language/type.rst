.. include:: substitution.txt

.. _sec-type-initialization:

Type and Initialization
#######################

.. productionlist:: DMS
   type                : "Any" 
                       : | "Boolean" 
                       : | ID_basic 
                       : | `featureType`
                       : | "Option" "[" `type` "]" 
                       : | "Either" "[" `type` "," `type` "]"
                       : | "(" `type` ( "," `type` )+ ")" 
                       : | "Seq" "[" `type` "]" 
                       : | "Set" "[" `type` "]"
   initialization      : "true" | "false"
                       : | <scalaExp : basic type value creation> 
                       : | "new" `featureType` [ "{" `attributeInit` "}" ]
                       : | "None" | "Some" "(" `initialization` ")"
                       : | "Left" "(" `initialization` ")" | "Right" "(" `initialization` ")"
                       : | "(" `initialization` ( "," `initialization` )+ ")"
                       : | "Seq" "(" [ `initialization` ( "," `initialization` )* ] ")"
                       : | "Set" "(" [ `initialization` ( "," `initialization` )* ] ")"
   attributeInit       : `attributeAnnotation`* "val" ID_attribute ":" `type` "=" `initialization`

A `type <#grammar-token-type>`__ can refer to :scalaapi:`scala.Any`,
|Boolean|, a declared 
:ref:`basic type <sec-basictype>`, or a declared 
:ref:`feature <sec-feature-requirement>` (or a compound of
declared features). In addition, DML (DMS) supports optional type
(:scalaapi:`scala.Option`), 
either (choice) type (:scalaapi:`scala.util.Either`), 
tuple type (:scalaapi:`scala.Tuple2`, :scalaapi:`scala.Tuple3`, ..., 
:scalaapi:`scala.Tuple22`), sequence type 
(:scalaapi:`scala.collection.immutable.Seq`), and set type 
(:scalaapi:`scala.collection.immutable.Set`). 
The :scalaapi:`scala.util.Either` type only supports a choice between
two types. In the future, DMS will provide choice types for more than two
types; however, for type safety guarantee, similar tricks to Scala tuple
types need to be provided (e.g., ``Either3``, ``Either4``, ...) and
handled by the |Extractor|. 

The :scalaapi:`scala.Any` type can only be used as a placeholder for
further attribute :ref:`type refinement <sec-type-refinement>` and cannot 
be directly initialized; that is, the attribute type should be refined 
before initializing it.

Attribute whose type is |Boolean| can be initialized directly by using
Scala's ``true`` or ``false`` literal; the literal will be 
:dms:`implicitly converted <package.scala#L95>` to |Boolean|. For example:

.. literalinclude:: /../../scala/ExsBooleanInit.scala
   :language: scala
   :linenos:

Note that an :dms:`implicit conversion <package.scala#L98>` is also 
provided from |Boolean| to :scalaapi:`scala.Boolean` for convenience;
for example, it is (implicitly) used in |MyReqPulseOx| at 
:dmsx:`line 22 <requirement/App.scala#L22>` and
:dmsx:`line 33 <requirement/App.scala#L33>` because 
:scalaapi:`scala.collection.immutable.Set <scala.collection.immutable.Set>`
``exists`` 
accepts a function that returns a :scalaapi:`scala.Boolean` value.

Attribute whose type is a basic type can be initialized using a Scala
expression (``<scalaExp: basic type value creation>``)
as described in the :ref:`Basic Type <sec-basictype>` Section
such as by using its implicit factory method (if defined). For example:

.. literalinclude:: /../../scala/ExsBasicType.scala
   :language: scala
   :linenos:

Attribute whose type is a feature (or a compound of features) can be 
initialized by creating (``new``) the feature with 
attribute initializations. For example, see 
:dmsx:`NoninPulseOx.manufacturerModel <device/NoninPulseOx.scala#L19-23>`.

Initializations for the other types use the typical Scala factory
methods associated with the types, whose usage syntax are specified above.
One thing worth mentioning is that, by default, ``Seq(...)`` creates
a :scalaapi:`scala.collection.Seq <scala.collection.Seq>` instead of
:scalaapi:`scala.collection.immutable.Seq <scala.collection.immutable.Seq>`
that is used in DMS;
DMS provides an 
:dml:`implicit conversion <package.scala#L99>` from 
:scalaapi:`scala.collection.Seq <scala.collection.Seq>`
to :scalaapi:`scala.collection.immutable.Seq <scala.collection.immutable.Seq>`
for convenience.
On the other hand ``Set(...)`` creates 
:scalaapi:`scala.collection.immutable.Set <scala.collection.immutable.Set>`,
hence, no conversion is necessary.


Representation Classes
**********************
Below is a table that maps type and initialization grammar rules to
DML AST classes that represent them.

.. |ttype| replace:: `type <#grammar-token-type>`__

.. |ftype| replace:: `featureType <#grammar-token-featureType>`__

.. |ainit| replace:: `attributeInit <#grammar-token-attributeInit>`__

.. |initialization| replace:: `initialization <#grammar-token-initialization>`__

===========================================================================  ==========================================================================================================================================
Grammar Rules                                                                DML AST Classes                                                          
===========================================================================  ==========================================================================================================================================
``Any``                                                                      :dml:`dml.ast.NamedType <ast/NamedType.java>` with :dmldoc:`name <ast/NamedType.html#name>` = ``"Any"``  
``Boolean``                                                                  :dml:`dml.ast.NamedType <ast/NamedType.java>` with :dmldoc:`name <ast/NamedType.html#name>` = ``"Boolean"``
``ID_basic``                                                                 :dml:`dml.ast.NamedType <ast/NamedType.java>` with :dmldoc:`name <ast/NamedType.html#name>` = fully-qualified name of the basic type
``ID_feature``                                                               :dml:`dml.ast.NamedType <ast/NamedType.java>` with :dmldoc:`name <ast/NamedType.html#name>` = fully-qualified name of the feature
``ID_feature ( "with" ID_feature )+``                                        :dml:`dml.ast.RefinedType <ast/RefinedType.java>` (with empty :dmldoc:`attributes <ast/RefinedType.html#attributes>`)
``"Option" "["`` |ttype| ``"]"``                                             :dml:`dml.ast.OptionType <ast/OptionType.java>`
``"Either" "["`` |ttype| "," |ttype| ``"]"``                                 :dml:`dml.ast.EitherType <ast/EitherType.java>`
``"("`` `type` ``( ","`` `type` ``)+ ")"``                                   :dml:`dml.ast.TupleType <ast/TupleType.java>`
``"Set" "["`` |ttype| ``"]"``                                                :dml:`dml.ast.SetType <ast/SetType.java>`
``"Seq" "["`` |ttype| ``"]"``                                                :dml:`dml.ast.SeqType <ast/SeqType.java>`
``"true"``                                                                   :dml:`dml.ast.BasicInit <ast/BasicInit.java>` with :dmldoc:`value <ast/BasicInit.html#value>` = ``"true"``
``"false"``                                                                  :dml:`dml.ast.BasicInit <ast/BasicInit.java>` with :dmldoc:`value <ast/BasicInit.html#value>` = ``"false"``
``<scalaExp : basic type value creation>``                                   :dml:`dml.ast.BasicInit <ast/BasicInit.java>` with :dmldoc:`value <ast/BasicInit.html#value>` = the result of |BasicType| |basic asString| 
``"new"`` |ftype| ``[ "{"`` |ainit| ``"}" ]``                                :dml:`dml.ast.FeatureInit <ast/FeatureInit.java>`
|ainit|                                                                      :dml:`dml.ast.Attribute <ast/Attribute.java>`
``"None"``                                                                   :dml:`dml.ast.NoneInit <ast/NoneInit.java>`
``"Some" "("`` |initialization| ``")"``                                      :dml:`dml.ast.SomeInit <ast/SomeInit.java>`
``"Left" "("`` |initialization| ``")"``                                      :dml:`dml.ast.EitherInit <ast/EitherInit.java>` with :dmldoc:`index <ast/EitherInit.html#index>` = ``0``
``"Right" "("`` |initialization| ``")"``                                     :dml:`dml.ast.EitherInit <ast/EitherInit.java>` with :dmldoc:`index <ast/EitherInit.html#index>` = ``1``
``"Seq" "(" [`` |initialization| ``( ","`` |initialization| ``)* ] ")"``     :dml:`dml.ast.SetInit <ast/SetInit.java>`
``"Set" "(" [`` |initialization| ``( ","`` |initialization| ``)* ] ")"``     :dml:`dml.ast.SeqInit <ast/SeqInit.java>`
===========================================================================  ==========================================================================================================================================

As can be observed :dml:`dml.ast.EitherType <ast/EitherType.java>`
and :dml:`dml.ast.EitherInit <ast/EitherInit.java>` are designed to 
support more than two choice types. 
Moreover, :dml:`dml.ast.RefinedType <ast/RefinedType.java>` supports
declaring attributes or attribute refinements; however, we currently
reserve this for future needs (hence, we do not describe it here
at this point).


.. _sec-type-refinement:

Type Refinement
***************

In general, type refinement is determined based on sub-typing 
(|subtypeof|). More specifically:

1.   For all type *T*, ``Any`` (:scalaapi:`scala.Any <scala.Any>`) can
     be refined by *T*.

2.   A basic type *T*\ :sub:`1` can be refined by another basic type 
     *T*\ :sub:`2` if, 
   
     *T*\ :sub:`2` |subtypeof| *T*\ :sub:`1`.
   
3.   A feature *F*\ :sub:`1` can be refined by another feature 
     *F*\ :sub:`2` if,
   
     *F*\ :sub:`2` |subtypeof| *F*\ :sub:`1`.

4.   A compound feature type *CF* = *F*\ :sub:`1` ``with`` ... ``with`` 
     *F*\ :sub:`N` can be refined by a feature *F* if,
   
     for all i where 1 <= i <= N, *F* |subtypeof| *F*\ :sub:`i`.
   
5.   For a set of features *FS* = { *F*\ :sub:`1`, ..., *F*\ :sub:`N` },
     let *With*\ (\ *FS*\ ) = *F*\ :sub:`1` ``with`` ... ``with`` 
     *F*\ :sub:`N`. A compound feature type *CF*\ :sub:`1` = 
     *F1*\ :sub:`1` ``with`` ... ``with`` *F1*\ :sub:`N` 
     can be refined by another compound feature type *CF*\ :sub:`2` =
     *F2*\ :sub:`1` ``with`` ... ``with`` *F2*\ :sub:`M` if,
   
     for all i where 1 <= i <= N, there exists *subCF*\ :sub:`2` in 
     *PowerSet*\ (\ { *F2*\ :sub:`1`, ..., *F2*\ :sub:`M` }\ ) such that
     *With*\ (\ *subCF*\ :sub:`2`) refines *F1*\ :sub:`i`.
   
     To put it simply, a compound feature type *CF*\ :sub:`1`
     can be refined by another compound feature type *CF*\ :sub:`2` if,
    
     { *F1* | *F1*\ :sub:`i` |subtypeof| *F1*, 1 <= i <= N } 
     is a subset of
     { *F2* | *F2*\ :sub:`j` |subtypeof| *F2*, 1 <= j <= M }.

6.   An option type ``Option[`` *T*\ :sub:`1` ``]`` can be refined by
     ``Option[`` *T*\ :sub:`2` ``]`` if,
   
     *T*\ :sub:`1` can be refined by *T*\ :sub:`2`.
   
7.   An either type ``Either[`` *T*\ :sub:`1` ``,`` *T*\ :sub:`2` ``]`` 
     can be refined by ``Either[`` *T*\ :sub:`3` ``,`` *T*\ :sub:`4` ``]`` 
     if,
   
     *T*\ :sub:`1` can be refined by *T*\ :sub:`3` and 
     *T*\ :sub:`2` can be refined by *T*\ :sub:`4`.
   
8.   A tuple type 
     ``(`` *T1*\ :sub:`1` ``,`` ... ``,`` *T1*\ :sub:`N` ``)``
     can be refined by another tuple type
     ``(`` *T2*\ :sub:`1` ``,`` ... ``,`` *T2*\ :sub:`N` ``)`` if,
  
     for all i where 1 <= i <= N, *T1*\ :sub:`i` can be refined by
     *T2*\ :sub:`i`.

9.   A sequence type ``Seq[`` *T*\ :sub:`1` ``]`` can be refined by
     ``Seq[`` *T*\ :sub:`2` ``]`` if,
   
     *T*\ :sub:`1` can be refined by *T*\ :sub:`2`.

10.  A set type ``Set[`` *T*\ :sub:`1` ``]`` can be refined by
     ``Set[`` *T*\ :sub:`2` ``]`` if,
   
     *T*\ :sub:`1` can be refined by *T*\ :sub:`2`.

.. note:: The |subtypeof| relation is reflexive. That is, for all type 
          *T*, *T* |subtypeof| *T*. 

Well-Formedness
***************
