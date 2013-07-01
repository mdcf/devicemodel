export BUILD_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
DIR=${1:-build}
tools/bin/sbt test "compile:packageBin" "compile:packageSrc" "make-dist $DIR"
cd $DIR
ant
