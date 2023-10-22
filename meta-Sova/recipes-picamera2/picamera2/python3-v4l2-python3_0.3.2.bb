
SUMMARY = "Python bindings for the v4l2 userspace api."
HOMEPAGE = "https://pypi.org/project/v4l2-python3/"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "https://files.pythonhosted.org/packages/f1/b0/dbb2f0dd273fbacbe392225b1e0e8d63ff37247f69481199a33b0ef5cb4f/v4l2-python3-0.3.2.tar.gz"
SRC_URI[md5sum] = "710a837bd8c00ec00ad41f0afe2930db"
SRC_URI[sha256sum] = "b7ae81ce7e2908498bd7e9bb978d5ed9ab70c12ba79c45ddda65d0a302422f9f"

S = "${WORKDIR}/v4l2-python3-0.3.2"

RDEPENDS_${PN} = ""

inherit setuptools3
