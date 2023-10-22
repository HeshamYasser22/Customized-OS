
SUMMARY = "Models used by the face_recognition package."
HOMEPAGE = "https://github.com/ageitgey/face_recognition_models"
AUTHOR = "Adam Geitgey <ageitgey@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e12c025f33913f2167514339be62c3fd"

SRC_URI = "https://files.pythonhosted.org/packages/cf/3b/4fd8c534f6c0d1b80ce0973d01331525538045084c73c153ee6df20224cf/face_recognition_models-0.3.0.tar.gz"
SRC_URI[md5sum] = "53f60e9165958b2bb8841d66dde3f02d"
SRC_URI[sha256sum] = "b79bd200a88c87c9a9d446c990ae71c5a626d1f3730174e6d570157ff1d896cf"

S = "${WORKDIR}/face_recognition_models-0.3.0"

RDEPENDS_${PN} = ""

inherit setuptools3
