
SUMMARY = "Python command-line parsing library"
HOMEPAGE = "https://github.com/ThomasWaldmann/argparse/"
AUTHOR = "Thomas Waldmann <tw@waldmann-edv.de>"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=09d08bb5b7047e2688ea3faad6408aa8"

SRC_URI = "https://files.pythonhosted.org/packages/18/dd/e617cfc3f6210ae183374cd9f6a26b20514bbb5a792af97949c5aacddf0f/argparse-1.4.0.tar.gz"
SRC_URI[md5sum] = "08062d2ceb6596fcbc5a7e725b53746f"
SRC_URI[sha256sum] = "62b089a55be1d8949cd2bc7e0df0bddb9e028faefc8c32038cc84862aefdd6e4"

S = "${WORKDIR}/argparse-1.4.0"

RDEPENDS_${PN} = ""

inherit setuptools3
