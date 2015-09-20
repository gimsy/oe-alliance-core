SUMMARY = "Firmware files for mn88436"
LICENSE = "CLOSED"
require conf/license/license-close.inc

PACKAGE_ARCH = "all"

PR = "r00"

SRC_URI = "file://firmware-mn88436.zip"

S = "${WORKDIR}"

PACKAGES = "${PN}"
FILES_${PN} += "${base_libdir}/firmware"

do_install() {
    install -d ${D}${base_libdir}/firmware
    install -m 0644 dvb-fe-mn88436-atsc.fw ${D}${base_libdir}/firmware/dvb-fe-mn88436-atsc.fw
    install -m 0644 dvb-fe-mn88436-pseq.fw ${D}${base_libdir}/firmware/dvb-fe-mn88436-pseq.fw
}