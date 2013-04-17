# Requirements:
# * sphinx: http://sphinx-doc.org
# * pygments: http://pygments.org
# * pygments-style-github: https://pypi.python.org/pypi/pygments-style-github
export PATH=$PATH:/opt/local/bin:/usr/texbin
cd src/main/resources
make html
cd ../../..