`MDCF <http://mdcf.santos.cis.ksu.edu>__ Device Modeling Language (DML)
#######################################################################

Documentation
*************

* `DML in Scala <http://mdcf.github.io/doc/dms/>`__

* `DML Javadoc <http://mdcf.github.io/doc/dml/>`__


Setting up Development Environment
**********************************

1. Download and install Sireum by following the instructions at: 
   http://www.sireum.org/download.

2. Download the `DML in Scala (DMS) project set file <https://github.com/mdcf/devicemodel/blob/master/dms.psf>`__.
   If you are a MDCF team member at GitHub with SSH key installed, you can use the 
   `project set file with write access <https://github.com/mdcf/devicemodel/blob/master/dms.psf>`__ instead.

3. Launch `Sireum Development Environment (DE) <http://www.sireum.org/features>`__::

   sireum launch sireumdev

   Pick a directory for your workspace when asked. Moreover, agree when asked to run Scala diagnostics;
   enable JDT Weaving for Scala IDE and then quit DE; relaunch Sireum DE.

4. Add ``SIREUM_HOME/apps/platform/java`` in Eclipe's 
   `Java Installed JREs preference page <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fdebug%2Fref-installed_jres.htm>`__,
   and make it the default. In addition, set Eclipse's `Java Compiler compliance level <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fref-preferences-compiler.htm>`__ to 1.7.
   (If Eclipse shows you a dialog box indicating that "Subversive Native Library Not Available",
   it means that you do not have native SVN installed; click Ok to close the 
   dialog box. You can correct this issue by setting SVN Interface Client to 
   "SVNKit" in the  Eclipse's Team->SVN preference page.)

5. `Import the project set file <http://wiki.eclipse.org/PSF>`__ downloaded in Step 2.
   This should import some projects into your workspace such as `sireum-lib <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-lib>`__
   and `mdcf-dms-test <https://github.com/mdcf/devicemodel/tree/master/mdcf-dms-test>`__. 
   There should not be any compile error. If errors persist, try cleaning all projects. 
   If it still fails, exit Eclipse and relaunch Sireum DE as follows::

   sireum launch sireumdev --args -clean

   (Please contact the project owners if still unsuccessful.)

6. Run the JUnit test in ``mdcf-dms-test`` by right clicking the project and 
   select "Run As" and then "JUnit Test"; all tests should pass.

7. If you are making changes to the codebase, import the following in the respective Eclipse preference pages:
 
   * In `Java -> Code Style -> Clean Up preference page <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fcodestyle%2Fref-preferences-cleanup.htm>`__:
     `sireum-util/codestyle/java-clean-up.xml <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-util/codestyle/java-clean-up.xml>`__
   
   * In `Java -> Code Style -> Formatter preference page <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fcodestyle%2Fref-preferences-formatter.htm>`__: 
     `sireum-util/codestyle/java-formatter.xml <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-util/codestyle/java-formatter.xml>`__
   
   * In `Scala -> Formatter preference page <http://scala-ide.org/docs/current-user-doc/features/typingviewing/formatting/index.html>`__: 
     `sireum-util/codestyle/scala-formatterPreferences.properties <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-util/codestyle/scala-formatterPreferences.properties>`__
   
   Make sure to run Java source clean up before committing Java code.
   Similarly, make sure to run Scala formatter before committing Scala code. 