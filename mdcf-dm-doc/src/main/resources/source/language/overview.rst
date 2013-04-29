.. include:: substitution.txt

Overview
########

Specification Form
******************

We will specify the context free grammar of DMS using Extended Backus-Naur 
Form (EBNF). Specifically:

* Double quotes (``"`` ... ``"``)  delimit tokens
* Midbar (``|``) separates production rule alternatives
* Parenthesis ( ``(`` ... ``)``  ) groups rules
* Star character (``*``) denotes zero or more repetition of rules
* Plus character (``+``) denotes one or more repetition of rules
* Square brackets (``[`` ... ``]``) delimit optional rules
* ``ID`` denotes Java-like identifiers; a hint that starts with an 
  underscore (``_``) may be given to qualify what the identifier should 
  refer to. For example, ``ID_basic`` indicates that it is an identifier 
  of a basic type.
* Angle brackets (``<`` ... ``>``) denote DMS entities whose 
  specifications are not formally specified in the grammar. For example,  
  ``<scalaExp : java.lang.String(`` *S* ``)>`` denotes a Scala expression 
  whose type resolves to some |String| constant *S* such as ``"abc"``, 
  which is equivalent to ``"a" + "bc"`` because the Scala compiler 
  optimizes such static expression to a constant at compile time, hence, 
  it not only knows that its type is |String|, but also that its value is
  ``"abc"`` at  runtime. The design intentions behind angle bracket'd 
  rules are explained as the production rules using the angle brackets are
  discussed.

.. note:: Because there are multiple ways to express the device models in 
          Scala, the specification described here should not be treated as
          prescriptive. Instead, the specification is provided as a 
          guideline for people that are not familiar with Scala (but 
          familiar with Java) in order for the model to be accepted by the
          DMS Model Extractor; some possible variations are described on 
          how one can express a model differently.

Representation and API
**********************

In addition, for the grammar productions, we describe DML implementation 
classes and API; when referring to such classes/packages, we use
:dml:`dml <>` as a shorthand for the :dml:`edu.ksu.cis.santos.mdcf.dml <>`
package.
Similarly, we use :dms:`dms <>` as a shorthand for the 
:dms:`edu.ksu.cis.santos.mdcf.dms <>` package.
The DML Abstract Syntax Tree (AST) Java classes are defined in the  
:dml:`dml.ast <ast>` package with associated AST constructor methods 
in |Ast| (and its weak version |AstWeak|), 
symbol table API in |SymbolTable|, 
visitor API in |IVisitor| and |AVisitor|,
and XML de/serialization API in |XStreamer|.
The |Extractor| 
`Scala object <http://en.wikibooks.org/wiki/Scala/Objects>`_ 
provides methods to extract DML AST from DMS models.

Furthermore, we also describe AST well-formedness throughout the discussion of
various parts of DMS; some of the well-formedness are enforced by the Scala
compiler, while some additional ones are enforced by the |Extractor|, and some 
are (to be) done after the extraction process. 
 
.. figure:: ../../../../../../mdcf-dml-ast/src/main/resources/edu/ksu/cis/santos/mdcf/dml/ast/dml-ast.png
   :scale: 10%

   DML AST UML Class Diagram

.. figure:: ../../../../../../mdcf-dml-ast/src/main/resources/edu/ksu/cis/santos/mdcf/dml/API.png
   :scale: 10%

   DML AST Construction, Symbol Table, XML de/serialization, and Visitor API UML Class Diagram


Nullity and Immutability
========================

All method parameters in all the DML API are non-null by 
default; these are declared in the respective package infos 
(:dml:`dml.ast <ast/package-info.java>`, 
:dml:`dml.serialization <serialization/package-info.java>`, 
:dml:`dml.symbol <symbol/package-info.java>`). 
In addition, all DML methods return non-null values.

All DML objects are immutable (object state changes may occur but not 
observable through the API). Each AST node class stores its children in 
``public`` ``final`` fields, which are non-null; 
fields whose type is |List| store immutable |List| values. 
In addition, each node class inherits from the 
:dml:`dml.ast.AstNode <ast/AstNode.java>`, which provides a 
:dmldoc:`children <ast/AstNode.html#children()>` method that returns an array of 
the node's children; the returned array can be mutated but it does not affect 
the AST node.

.. _sec-string-representation:

String Representation
=====================

Calling the ``toString`` method on an AST object or a |SymbolTable| object 
produces a Java and Scala code as a 
|String| that, when compiled under the appropriate import context 
and executed, builds a structurally and behaviorally equivalent object. 
