MDCF Device Modeling Language (DML)
===================================

Setting up Development Environment
----------------------------------

1. Download and install Sireum by following the instructions at http://www.sireum.org/download

2. Download the `DML in Scala (DMS) project set file <https://github.com/mdcf/devicemodel/blob/master/dms.psf>`__.

3. Launch `Sireum Development Environment <http://www.sireum.org/features>`__ 
   (pick a directory for your workspace when asked)::

   sireum launch sireumdev

4. `Import the project set file downloaded in Step 2 in Eclipse <http://wiki.eclipse.org/PSF>`__.
   This should import some projects into your workspace such as `sireum-lib <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-lib>`__
   and `mdcf-dms-test <https://github.com/mdcf/devicemodel/tree/master/mdcf-dms-test>`__.

5. Import `sireum-lib/lib/sireum.userlibraries <https://www.assembla.com/code/sireum-core/git-3/nodes/master/sireum-lib/lib/sireum.userlibraries>`__ 
   from your workspace in Eclipse's 
   `Java User Libraries preference page <http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fbuildpath%2Fref-preferences-user-libraries.htm>`__

6. Run the JUnit test in ``mdcf-dms-test`` by right clicking the project and select "Run As" and then "JUnit Test".
   All tests should pass.
