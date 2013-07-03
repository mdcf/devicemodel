if '%1'=='' ( set DIR=build ) else ( set DIR=%1% )
call tools\bin\sbt "compile:packageBin" "compile:packageSrc" "make-dist %DIR%"
cd %DIR%
ant
