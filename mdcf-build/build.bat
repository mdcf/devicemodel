if defined %1 ( set DIR=%1 ) else ( set DIR=build )
tools\bin\sbt "compile:packageBin" "compile:packageSrc" "make-dist %DIR%"
cd %DIR%
ant
