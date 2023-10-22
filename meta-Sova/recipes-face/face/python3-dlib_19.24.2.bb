
SUMMARY = "A toolkit for making real world machine learning and data analysis applications"
HOMEPAGE = "https://github.com/davisking/dlib"
AUTHOR = "Davis King <davis@dlib.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2c7a3fa82e66676005cd4ee2608fd7d2"

SRC_URI = "https://files.pythonhosted.org/packages/2e/9d/4e1003c044bdb07f7c0d83ae87d694e10e5a6c296b84566aa9a6ec9eed2a/dlib-19.24.2.tar.gz"
SRC_URI[md5sum] = "eb06d94fb36fb3e9ca71f5f708014935"
SRC_URI[sha256sum] = "2d4f618073bc6b297aa01ce05595a2d32b5b37e69cafd99f796e77346f6dcfb5"

S = "${WORKDIR}/dlib-19.24.2"

RDEPENDS_${PN} = ""

inherit setuptools3
