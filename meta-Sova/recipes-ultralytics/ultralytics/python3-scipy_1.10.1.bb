
SUMMARY = "Fundamental algorithms for scientific computing in Python"
HOMEPAGE = "https://scipy.org/"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES_bundled.txt;md5=26d3fc7339f71134f49a1763ece2f42b"

SRC_URI = "https://files.pythonhosted.org/packages/84/a9/2bf119f3f9cff1f376f924e39cfae18dec92a1514784046d185731301281/scipy-1.10.1.tar.gz"
SRC_URI[md5sum] = "de3db61d840456634ba37f2b5816e049"
SRC_URI[sha256sum] = "2cf9dfb80a7b4589ba4c40ce7588986d6d5cebc5457cad2c2880f6bc2d42f3a5"

S = "${WORKDIR}/scipy-1.10.1"

RDEPENDS_${PN} = "python3-numpy"

inherit setuptools3
