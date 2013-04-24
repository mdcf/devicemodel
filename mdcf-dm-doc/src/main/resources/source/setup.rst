Setting Up Development Environment
##################################

1. Download and install Sireum by following the instructions at: 
   http://www.sireum.org/download.
   
   (Alternatively, you can install
   `Java 7 SDK <http://www.oracle.com/technetwork/java/javase/downloads/index.html>`__, 
   and `Eclipse <http://www.eclipse.org>`__
   with `Scala IDE for Scala 2.10 <http://scala-ide.org>`__ and 
   `EGit <http://www.eclipse.org/egit/>`__ plugins.) 

2. Launch `Sireum Development Environment (DE) <http://www.sireum.org/features>`_ 
   (add ``-h`` for help to supply custom Eclipse command-line arguments such
   as configuring memory)::

       sireum launch sireumdev

   Pick a directory for your workspace when asked. Moreover, agree when asked to run Scala diagnostics;
   enable JDT Weaving for Scala IDE and then quit DE; relaunch Sireum DE.

3. Add ``SIREUM_HOME/apps/platform/java`` in Eclipe's 
   `Java Installed JREs preference page <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fdebug%2Fref-installed_jres.htm>`_,
   and make it the default. In addition, set Eclipse's `Java Compiler compliance level <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fref-preferences-compiler.htm>`_ to 1.7.
   (If Eclipse shows you a dialog box indicating that "Subversive Native Library Not Available",
   it means that you do not have native SVN installed; click Ok to close the 
   dialog box. You can correct this issue by setting SVN Interface Client to 
   "SVNKit" in the  Eclipse's Team->SVN preference page.)

4. Download the `DML in Scala (DMS) project set file <https://github.com/mdcf/devicemodel/blob/master/dms.psf>`_.
   If you are a MDCF team member at 
   `GitHub with SSH key installed <https://help.github.com/articles/generating-ssh-keys>`__, 
   you can use the 
   `project set file with write access <https://github.com/mdcf/devicemodel/blob/master/dms-write.psf>`_ 
   instead. 
   
   `Import the project set file <http://wiki.eclipse.org/PSF>`_ .
   This should import some projects into your workspace such as `sireum-lib <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-lib>`_
   and `mdcf-dms-test <https://github.com/mdcf/devicemodel/tree/master/mdcf-dms-test>`_. 
   There should not be any compile error. 
   
   If errors persist somehow, try cleaning all projects. If it still fails, 
   exit Eclipse and relaunch Sireum DE as follows::

       sireum launch sireumdev --args -clean

   (Please contact the project owners if still unsuccessful.)

5. Run the JUnit test in ``mdcf-dms-test`` by right clicking the project and 
   select "Run As" and then "JUnit Test"; all tests should pass.

6. If you plan to commit code to the repository, import the following in the 
   respective Eclipse preference pages 
   (the files should already in your workspace after following Step 5):
 
   * In `Java -> Code Style -> Clean Up preference page <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fcodestyle%2Fref-preferences-cleanup.htm>`_:
     `sireum-util/codestyle/java-clean-up.xml <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-util/codestyle/java-clean-up.xml>`_
   
   * In `Java -> Code Style -> Formatter preference page <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fcodestyle%2Fref-preferences-formatter.htm>`_: 
     `sireum-util/codestyle/java-formatter.xml <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-util/codestyle/java-formatter.xml>`_
   
   * In `Scala -> Formatter preference page <http://scala-ide.org/docs/current-user-doc/features/typingviewing/formatting/index.html>`_: 
     `sireum-util/codestyle/scala-formatterPreferences.properties <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-util/codestyle/scala-formatterPreferences.properties>`_
   
   Make sure to run *Java source clean up* before committing Java code.
   Similarly, make sure to run *Scala source formatter* before committing Scala
   code. You can run the clean up and formatter on all source in a project wide 
   by right clicking the project and then selecting ``Source -> Clean up...``
   and ``Source -> Format``, respectively. This also works at source folders and
   packages.
   
    