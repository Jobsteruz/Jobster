package com.smartbox.jobster.service.cvparser.batch;

/** RAR 4/5 signature checks used before the archive extractor is invoked. */
public final class RarMagic {

    private static final byte[] RAR_PREFIX = {'R', 'a', 'r', '!', 0x1A, 0x07};
    private static final byte RAR4_VERSION = 0x00;
    private static final byte RAR5_VERSION = 0x01;

    private RarMagic() {
    }

    public static boolean isRarSignature(byte[] bytes) {
        if (bytes == null || bytes.length < RAR_PREFIX.length + 1) return false;
        for (int i = 0; i < RAR_PREFIX.length; i++) {
            if (bytes[i] != RAR_PREFIX[i]) return false;
        }
        return bytes[RAR_PREFIX.length] == RAR4_VERSION || bytes[RAR_PREFIX.length] == RAR5_VERSION;
    }

    public static boolean isRar5Signature(byte[] bytes) {
        return isRarSignature(bytes) && bytes[RAR_PREFIX.length] == RAR5_VERSION;
    }
}
