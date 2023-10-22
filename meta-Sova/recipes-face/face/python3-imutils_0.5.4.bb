
SUMMARY = "A series of convenience functions to make basic image processing functions such as translation, rotation, resizing, skeletonization, displaying Matplotlib images, sorting contours, detecting edges, and much more easier with OpenCV and both Python 2.7 and Python 3."
HOMEPAGE = "https://github.com/jrosebr1/imutils"
AUTHOR = "Adrian Rosebrock <adrian@pyimagesearch.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=4c9c1d46bd5e516df33edc77b2759eda"

SRC_URI = "https://files.pythonhosted.org/packages/3f/d3/ecb4d108f6c1041d24842a345ee0123cd7f366ba75cf122601e856d42ba2/imutils-0.5.4.tar.gz"
SRC_URI[md5sum] = "6769dc601bfea571d950b5f55ccb74f1"
SRC_URI[sha256sum] = "03827a9fca8b5c540305c0844a62591cf35a0caec199cb0f2f0a4a0fb15d8f24"

S = "${WORKDIR}/imutils-0.5.4"

RDEPENDS_${PN} = ""

inherit setuptools3
