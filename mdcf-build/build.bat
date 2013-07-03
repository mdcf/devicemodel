if defined %1 ( DIR=%1 ) else ( DIR=build )
tools\bin\sbt "compile:packageBin" "compile:packageSrc" "make-dist %DIR%"
cd %DIR%
ant
