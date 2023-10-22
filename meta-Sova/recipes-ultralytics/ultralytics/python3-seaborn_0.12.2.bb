
SUMMARY = "Statistical data visualization"
HOMEPAGE = "None"
AUTHOR = "None <Michael Waskom <mwaskom@gmail.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a6bb18b889620c6cb9f24aa008bcb365"

SRC_URI = "https://files.pythonhosted.org/packages/8a/77/5cde8bc47df770486acf64f550839b4136d1696e5e4d57ce33fa1823972b/seaborn-0.12.2.tar.gz"
SRC_URI[md5sum] = "7820a34534d13fd09aec2ae72ddb79f6"
SRC_URI[sha256sum] = "374645f36509d0dcab895cba5b47daf0586f77bfe3b36c97c607db7da5be0139"

S = "${WORKDIR}/seaborn-0.12.2"

RDEPENDS_${PN} = "python3-numpy python3-pandas python3-matplotlib"

inherit setuptools3
