export BUILD_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
DIR=${1:-.}
tools/bin/sbt "compile:packageBin" "compile:packageSrc" "make-dist $DIR"
cd $DIR/build
ant
