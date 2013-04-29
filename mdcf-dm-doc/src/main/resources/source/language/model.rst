.. include:: substitution.txt

.. _sec-model:

Model
#####

.. productionlist:: DMS
   model               : `package` `imports` `declaration`*
   package             : "package" ( ID "." )* ID
   imports             : `importdms` `import`*
   importdms           : "import" "edu" "." "ksu" "." "cis" "." "santos" "." "mdcf" "." "dms" "." "_"
   import              : "import" ( ID "." )* ID [ "." "_" ]
   declaration         : `basicType` | `feature` | `requirement`

A model may be specified in multiple Scala source files. 
For each file, a model source starts with a 
`package <#grammar-token-package>`__ declaration, followed by 
`import <#grammar-token-import>`__ declarations and 
declarations of :ref:`basic types <sec-basictype>`, 
:ref:`features, or requirements <sec-feature-requirement>`. 
That is, it is assumed that models are
specified in a package other than the Scala or Java "default" package.
The grammar recommends importing all elements (specified using ``_`` 
instead of ``*``  like in Java) defined in the :dms:`dms <>` 
|ScalaPackage| and :dms:`dms.package <package.scala>` 
|PackageObject|, 
which defines DMS primordial types, |implicit| conversions,
and a |macro|, which will be described in the appropriate subsequent 
sections below.
 
In addition, it recommends importing :ref:`basic types <sec-basictype>` 
or :ref:`features <sec-feature-requirement>` defined in 
different packages; note that Scala allows import declarations to appear in many
places, including inside class declarations and expression blocks among others.

One can alternatively choose to not import any package elements and always use 
the fully qualified name of package elements.

Some examples of Scala model files can be found at:

* :dmsx:`BasicType <BasicType.scala>`

* :dmsx:`Schema <schema/Schema.scala>`

* :dmsx:`Class <clas/Class.scala>`

* :dmsx:`NoninPulseOx <device/NoninPulseOx.scala>`

* :dmsx:`NellcorPulseOx <device/NellcorPulseOx.scala>`

* :dmsx:`MultiMonitor <device/MultiMonitor.scala>`

* :dmsx:`App <requirement/App.scala>`

We will use portions of the above examples to illustrate various DMS elements
in the subsequent sections.


Representation Classes and Construction
***************************************

A model is represented using the :dml:`dml.ast.Model <ast/Model.java>` AST class which
has an :javadoc:`Iterable <java/lang/Iterable.html>` 
of :dml:`dml.ast.Declarations <ast/Declaration.java>`, which can be either
:dml:`dml.ast.BasicType <ast/BasicType.java>`, :dml:`dml.ast.Feature <ast/Feature.java>`, or
:dml:`dml.ast.Requirement <ast/Requirement.java>`.

One can construct a model by calling the |Ast| 
:dmldoc:`model <ast/Ast.html#model(java.lang.Iterable)>`
static method as illustrated in the following :dmdocj:`example <ExModel.java>`:

.. literalinclude:: /../../java/ExModel.java
   :language: java
   :emphasize-lines: 8
   :linenos:

The above example creates a model with an empty list of declarations, and then
prints out the model and the model's declarations. The |Ast| 
:dmldoc:`list <ast/Ast.html#list(java.lang.Iterable)>`
methods are helper methods that when given either a variable or an 
:javadoc:`Iterable <java/lang/Iterable.html>` number of objects, they create an 
(immutable) list containing the provided objects. 

Notice that at :dmdocj:`line 8 <ExModel.java#L8>`, we need to use
``Ast.<Declaration> list()`` instead of just ``list()``. That is because
``list()`` without a parameter type supplied for its element type returns
``List<Object>``, which is incompatible with ``model``'s parameter that expects
a list of :dml:`dml.ast.Declaration <ast/Declaration.java>`. To address this issue,
one can use |AstWeak| API that have the same set
of AST construction methods, but with weaker compile-time parameter types that 
are checked at runtime; 
:javadoc:`IllegalArgumentException <java/lang/IllegalArgumentException.html>`
will be thrown if the runtime types are not what expected.  
Below is an :dmdocj:`example <ExModelWeak.java>` that illustrates the use of
|AstWeak| API:

.. literalinclude:: /../../java/ExModelWeak.java
   :language: java
   :emphasize-lines: 3,8
   :linenos:

Below is a similar :dmdocs:`example <ExsModel.scala>` written in Scala;
thanks to Scala's type inference, |Ast| API work
without a problem as can be seen at :dmdocs:`line 13 <ExsModel.scala\#L13>` 
(of course |AstWeak| would work as well):

.. literalinclude:: /../../scala/ExsModel.scala
   :language: scala
   :emphasize-lines: 13,17-21
   :linenos:

We mentioned previously in the :ref:`sec-string-representation` Section that
the AST ``toString`` method produces a code that construct structurally 
equivalent AST. This is illustrated at 
:dmdocs:`lines 17-21 <ExsModel.scala\#L17-21>` where
``m``'s ``toString`` is used to construct a Scala code
as |String| at line 19 (``s"`` ... ``"`` is a |string interpolator|)
along with the import declaration at line 18; 
:sutil:`Reflection <Reflection.scala>`'s ``eval`` method takes the |String| 
code, compiles it (at runtime), and then invokes the compiled code to produce a 
structurally equivalent model ``m2`` with respect to ``m`` as shown in at line 21.

.. note:: AST construction methods are named the same as the AST class names 
          that they build but with the first letter lowercased.


Extraction
**********

Instead of constructing AST manually by hand, |Extractor| provides 
:dms:`extractModel <ModelExtractor.scala#L75-88>` "static" methods 
that extract DML AST from *compiled* DMS model Java 
class files (see the :ref:`note below <extractor_note>`). 
Given an array of package |String| names, they return the DML AST model that is
represented in the packages and their sub-packages.

Below is an :dmdocj:`example <ExModelExtractor.java>` illustrating the use of 
|Extractor| API to extract DMS models from the :dmsx:`dms.example <>` package 
and its sub-packages:

.. literalinclude:: /../../java/ExModelExtractor.java
   :language: java
   :linenos:

.. |ClassLoader| replace:: :javadoc:`ClassLoader <java/lang/ClassLoader.html>`

Variants of the |Extractor| ``extractModel`` methods are provided to extract 
a model using a specific |ClassLoader| and 
|Extractor| 
:dms:`Reporter <ModelExtractor.scala#L28-32>`
for custimizing warning and error notifications during
the extraction process. By default, the |ClassLoader| that loads the 
|Extractor| is used, and warning and errors are printed to the console (output
and error streams, respectively).

.. _extractor_note:

.. note:: The |Extractor| extracts models from Java bytecode compiled from DMS 
          model source files. Thus, one need to compile the Scala source files
          first by using the Scala compiler. After compilation, the
          |Extractor| does not require access to the source code.
          
          When extracting a model, make sure that the Java classpath is setup
          properly so the |Extractor| can find the package elements. Otherwise,
          it would return a model with empty declarations. The |Extractor| will
          give a warning when such situation occurs.

          The |Extractor| is implemented using a combination of 
          :scaladoc:`Scala Runtime Reflection <overviews/reflection/overview.html>`,
          `Guava ClassPath <http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/reflect/ClassPath.html>`_,
          and
          `Java Reflection <http://docs.oracle.com/javase/tutorial/reflect/>`_, 
          including 
          `Java dynamic Proxy <http://docs.oracle.com/javase/tutorial/reflect/>`_.
          Interested reader is referred to the |Extractor| code and 
          Sireum's :sutil:`Reflection <Reflection.scala>` code.
          

SymbolTable
***********

Given a set of models, the |SymbolTable| 
:dmldoc:`of <symbol/SymbolTable.html#of(edu.ksu.cis.santos.mdcf.dml.ast.Model...)>` 
method creates an instance of |SymbolTable| that provides various methods to 
retrieve DML entities such as :ref:`basic types <sec-basictype>`,
:ref:`features <sec-feature-requirement>`,
:ref:`attributes <sec-feature-requirement>`, and
:ref:`invariants <sec-feature-requirement>`
in the models or by their fully-qualified name.

Below is an :dmdocj:`example <ExModelSymbolTable.java>` to illustate the 
construction of |SymbolTable| and its |String| representation:

.. literalinclude:: /../../java/ExModelSymbolTable.java
   :language: java
   :linenos:

The reader is referred to the |SymbolTable| Javadoc
to see what queries are available through the API;
we will mention some of the API in the relevant subsequent sections.


De/serialization
****************

The |XStreamer| API provides AST and symbol table serialization to XML 
and deserialization back from XML using XStream_ with custom converters that 
makes the produced XML representation easier to read as well as its size.
More specifically, it provides 
:dmldoc:`toXml <serialization/XStreamer.html#toXml(java.lang.Object)>` and 
:dmldoc:`fromXml <serialization/XStreamer.html#fromXml(java.io.InputStream)>` 
static methods for 
converting to/from |String|, |Writer|/|Reader|, or |OutputStream|/|InputStream|.   

Below is an :dmdocj:`example <ExModelXml.java>` that uses the |XStreamer| API:

.. literalinclude:: /../../java/ExModelXml.java
   :language: java
   :linenos:

The |XStreamer| API also provides serialization to JSON provided by its
:dmldoc:`toJson <serialization/XStreamer.html#toJson(java.lang.Object)>` 
methods that use XStream_ along with Jettison_. 
Deserialization from Json using |XStreamer| 
:dmldoc:`fromJson <serialization/XStreamer.html#fromJson(java.io.InputStream)>` 
static methods  is, however, currently not supported (there seems to be a 
deserialization bug in XStream_ with Jettison_ that warrants further 
investigations).

In addition, a custom XStream_ instance can be retrieved by calling the 
|XStreamer| :dmldoc:`xstream <serialization/XStreamer.html#xstream(boolean)>` 
static method.


Traversal/Visitor
*****************

The |IVisitor| interface and |AVisitor| class realize the visitor pattern for
(top-down, left-to-right) traversal of DML AST. 
Each visit method for different AST node type in |IVisitor| 
returns a boolean value that, if true, indicates the visitor should continue 
visiting the node's children; otherwise, the traversal is short-circuited by
skipping the node's children (and hence, the node's decendants). 

The visit methods for abstract AST node types (i.e., 
:dml:`dml.ast.Declaration <ast/Declaration.java>`, 
:dml:`dml.ast.Initialization <ast/Initialization.java>`, 
:dml:`dml.ast.Member <ast/Member.java>`, and 
:dml:`dml.ast.Type <ast/Type.java>`) will be visited first before any of its 
subtypes visit methods are called. 
For example, 
|IVisitor| |visitDeclaration| will be called before |visitBasicType|.
In such case, the AST traversal continues visiting the node's children
when **both** |visitDeclaration| and |visitBasicType| return true. 
 
The |AVisitor| class provides a basic implementation of |IVisitor| where calls 
to all visit methods of non-abstract AST node types
are routed to call (and return the return value of) |AVisitor|   
:dmldoc:`defaultCase <ast/AbstractVisitor.html#defaultCase(edu.ksu.cis.santos.mdcf.dml.ast.AstNode)>`,
which can be conveniently overriden in a sub-class.

Below is an :dmdocj:`example <ExModelVisitor.java>` to illustrate how one can 
traverse DML AST using the provided visitor API.

.. literalinclude:: /../../java/ExModelVisitor.java
   :language: java
   :emphasize-lines: 15,23,28,35-36
   :linenos:

The example creates a model with one :ref:`basic type <sec-basictype>`. 
The first visitor at 
:dmdocj:`lines 12-18 <ExModelVisitor.java#L12-18>` prints out
the name of any basic type it encounters at 
:dmdocj:`line 15 <ExModelVisitor.java#L15>`, which in this case prints
out ``Reached foo``. 
The second visitor at 
:dmdocj:`lines 20-30 <ExModelVisitor.java#L20-30>` throws an exception 
at :dmdocj:`line 28 <ExModelVisitor.java#L28>` whenever it encounters
a basic type; however, because its 
:dmdocj:`visitModel <ExModelVisitor.java#L22-24>` method returns false, the
visitor skips all model's children, hence skipping visiting the basic type
declaration (more precisely, all declarations).
The third visitor at 
:dmdocj:`lines 32-39 <ExModelVisitor.java#L32-39>` prints out AST node in
its :dmdocj:`defaultCase <ExModelVisitor.java#L34-38>` method; hence, it
prints out the model and the basic type.


Well-Formedness
***************
A set of models is well-formed if all user-defined 
:ref:`basic types <sec-basictype>`,
:ref:`features, and requirements <sec-feature-requirement>` are well-formed. 
