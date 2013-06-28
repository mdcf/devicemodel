How To Build MDCF using the Simple Build Tool (SBT)
===================================================

Requirement: 

* Java 7 SDK or above

* Apache Ant with JUnit4 support

----

Let ``REPO`` denotes the path containing mdcf-build,
``REPO_PRELUDE`` denotes the path containing sireum-core.prelude projects 
(e.g., sireum-util),
``REPO_CORE`` denotes the path containing sireum-core projects 
(e.g., sireum-pilar), and
``REPO_DML`` denotes the path containing mdcf-devicemodel projects 
(e.g., mdcf-dml-ast).

To run the build locally, create the following symbolic links:

    REPO/mdcf-build/codebase/sireum-core.prelude 

that points to ``REPO_PRELUDE``,

    REPO/mdcf-build/codebase/sireum-core

that points to ``REPO_CORE``, and

    REPO/mdcf-build/codebase/mdcf-devicemodel
    
that points to ``REPO_DML``.

Once that setup, change directory to:

    REPO/mdcf-build

To build and run test, run:
 
    build.sh [<result-path>]

The default ``<result-path>`` is the current directory (``.``).

To resolve mdcf-build Eclipse project dependency, run:

    tools/bin/sbt-init
