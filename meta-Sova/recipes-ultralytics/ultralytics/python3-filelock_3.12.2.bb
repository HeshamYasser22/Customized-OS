
SUMMARY = "A platform independent file lock."
HOMEPAGE = ""
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=911690f51af322440237a253d695d19f"

SRC_URI = "https://files.pythonhosted.org/packages/00/0b/c506e9e44e4c4b6c89fcecda23dc115bf8e7ff7eb127e0cb9c114cbc9a15/filelock-3.12.2.tar.gz"
SRC_URI[md5sum] = "d65c221c837b1a33fc87a3d4e3074331"
SRC_URI[sha256sum] = "002740518d8aa59a26b0c76e10fb8c6e15eae825d34b6fdf670333fd7b938d81"

S = "${WORKDIR}/filelock-3.12.2"

RDEPENDS_${PN} = ""

inherit setuptools3
