# Requirements:
# * sphinx: http://sphinx-doc.org
# * pygments: http://pygments.org
# * pygments-style-github: https://pypi.python.org/pypi/pygments-style-github
export PATH=$PATH:/opt/local/bin
cd src/main/resources
make singlehtml
cd ../../..