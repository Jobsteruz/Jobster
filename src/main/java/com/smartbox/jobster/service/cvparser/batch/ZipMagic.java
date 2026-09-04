package com.smartbox.jobster.service.cvparser.batch;

/**
 * Single source of truth for the ZIP local-file-header signature check. Both the server-side
 * {@link ZipExtractor} and the UI-side {@code CvBatchDialog} need to recognise a ZIP by its
 * first few bytes (to decide between the archive path and the single-file path). Keeping the
 * check in one place prevents the two from drifting apart.
 * <p>
 * The four bytes we care about are {@code 0x50 0x4B 0x03/0x05/0x07 0x04}. A plain local-file
 * header is {@code 03 04}; {@code 05 06} is the "end-of-central-directory" marker that appears
 * in empty archives; {@code 07 08} is the rare "data descriptor" marker. All three are valid
 * start-of-file signatures for a ZIP stream.
 */
public final class ZipMagic {

    /** {@code 'P'} — first byte of every ZIP local-file-header. */
    public static final byte SIG_P = 0x50;
    /** {@code 'K'} — second byte of every ZIP local-file-header. */
    public static final byte SIG_K = 0x4B;
    /** {@code 0x03 0x04} — local-file-header marker (third byte: {@code 0x03}). */
    public static final byte SIG_LOCAL_FILE = 0x03;
    /** {@code 0x05 0x06} — end-of-central-directory marker (empty archive; third byte: {@code 0x05}). */
    public static final byte SIG_END_OF_CD = 0x05;
    /** {@code 0x07 0x08} — data-descriptor marker (third byte: {@code 0x07}). */
    public static final byte SIG_DATA_DESC = 0x07;

    private ZipMagic() {
        // Utility
    }

    /**
     * @return {@code true} when the first four bytes match a valid ZIP local-file-header
     *         (or empty-archive / data-descriptor variants).
     */
    public static boolean isZipSignature(byte[] bytes) {
        if (bytes == null || bytes.length < 4) return false;
        if (bytes[0] != SIG_P || bytes[1] != SIG_K) return false;
        byte third = bytes[2];
        return third == SIG_LOCAL_FILE || third == SIG_END_OF_CD || third == SIG_DATA_DESC;
    }
}
