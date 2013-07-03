DIR=${1:-build}
tools/bin/sbt "compile:packageBin" "compile:packageSrc" "make-dist $DIR"
cd $DIR
ant
