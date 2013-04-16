export PATH=$PATH:/opt/local/bin
make singlehtml
cp -R build/singlehtml/* ../../../../../mdcf.github.io/doc/dms/
cp -R ../../../../mdcf-dml-ast/doc/* ../../../../../mdcf.github.io/doc/dml/