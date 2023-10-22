
SUMMARY = "The libcamera-based Python interface to Raspberry Pi cameras, based on the original Picamera library"
HOMEPAGE = "https://github.com/RaspberryPi/picamera2"
AUTHOR = "Raspberry Pi & Raspberry Pi Foundation <picamera2@raspberrypi.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6541a38108b5accb25bd55a14e76086d"

SRC_URI = "https://files.pythonhosted.org/packages/68/44/0eef4a37afc194f5a3eb2459be378d4ccededefb060f9796e6a0e68601a9/picamera2-0.3.9.tar.gz"
SRC_URI[md5sum] = "3dbce863943b9c23fcabf5ce697739c2"
SRC_URI[sha256sum] = "518481b3d90f49be261ac54cf295a18d1c0eb1b35c2e24da9f2c105ba760572f"

S = "${WORKDIR}/picamera2-0.3.9"

RDEPENDS_${PN} = "python3-pidng python3-numpy python3-pillow python3-prctl python3-v4l2-python3"

inherit setuptools3
