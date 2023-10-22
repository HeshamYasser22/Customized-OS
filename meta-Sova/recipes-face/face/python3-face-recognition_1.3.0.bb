
SUMMARY = "Recognize faces from Python or from the command line"
HOMEPAGE = "https://github.com/ageitgey/face_recognition"
AUTHOR = "Adam Geitgey <ageitgey@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5350ad154eb80290f2faad56592be730"

SRC_URI = "https://files.pythonhosted.org/packages/6c/49/75dda409b94841f01cbbc34114c9b67ec618265084e4d12d37ab838f4fd3/face_recognition-1.3.0.tar.gz"
SRC_URI[md5sum] = "4e54f245f8fe4751a9f0ef5301a7cd40"
SRC_URI[sha256sum] = "5e5efdd1686aa566af0d3cc1313b131e4b197657a8ffd03669e6d3fad92705ec"

S = "${WORKDIR}/face_recognition-1.3.0"

RDEPENDS_${PN} = "python3-face-recognition-models python3-click python3-dlib python3-numpy python3-pillow"

inherit setuptools3
