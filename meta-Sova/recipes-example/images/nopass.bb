require /home/hesham/poky/meta/recipes-core/images/core-image-base.bb
IMAGE_FEATURES:remove += " \
    debug-tweaks \
"

# Add more users
inherit extrausers
#    usermod -P rootpasswd root; \
# Set the password for the root user, and create a new user nambed 'technexion`
EXTRA_USERS_PARAMS = " \
    usermod -p '\$6\$rootpass\$kWCvqYPv6Lpy7G4rNGofluxeKbxNIiXRs5FaHpjamhvhl9P4gt2/EFsA8.JOzY3ldT.fy2ojauP0tYX7IZGZ9/' root; \
    useradd -p '' SOVA \
"

# Define a variable to hold the list of systemd unit config files to be modified.
# Modify the serial console config and the video console config files.
TN_LOCAL_GETTY ?= " \
     ${IMAGE_ROOTFS}${systemd_system_unitdir}/serial-getty@.service \
     ${IMAGE_ROOTFS}${systemd_system_unitdir}/getty@.service \
"
# Define a function that modifies the systemd unit config files with the autologin arguments
local_autologin () {
    sed -i -e 's/^\(ExecStart *=.*getty \)/\1--autologin SOVA /' ${TN_LOCAL_GETTY}
}

# Add the function so that it is executed after the rootfs has been generated
ROOTFS_POSTPROCESS_COMMAND += "local_autologin; "
