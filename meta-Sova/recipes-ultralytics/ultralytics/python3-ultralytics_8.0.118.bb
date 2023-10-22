
SUMMARY = "Ultralytics YOLOv8 for SOTA object detection, multi-object tracking, instance segmentation, pose estimation and image classification."
HOMEPAGE = "https://github.com/ultralytics/ultralytics"
AUTHOR = "Ultralytics <hello@ultralytics.com>"
LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb1e647870add0502f8f010b19de32af"

SRC_URI = "https://files.pythonhosted.org/packages/bf/1e/2df169dbe0918356886701d5b01f401bfe014bfbfce5f8c65c4c63304713/ultralytics-8.0.118.tar.gz"
SRC_URI[md5sum] = "aa011346274c9e621a8797cb12fab320"
SRC_URI[sha256sum] = "42f3543a9a0867fc66af6620b0438dda5e853c65bf6b27dcf6c3f328e9adb882"

S = "${WORKDIR}/ultralytics-8.0.118"

RDEPENDS_${PN} = "python3-matplotlib python3-pillow python3-pyyaml python3-requests python3-scipy python3-tqdm python3-pandas python3-seaborn python3-psutil"

inherit setuptools3
