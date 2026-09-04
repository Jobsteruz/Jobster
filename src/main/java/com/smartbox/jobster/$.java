package com.smartbox.jobster;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Supplier;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.SmartTenantEntity;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.utils.FileTokenUtil;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.server.Command;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.flowui.asynctask.UiAsyncTasks;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.safety.Safelist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.lang.Nullable;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * Date: 11/15/2023 2:54 PM
 */

public class $ {
    private static final Logger log = LoggerFactory.getLogger($.class);

    public static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    public static final String PHONE_REGEX = "\\+?(\\d{1,2})?[ .-]?\\(?(\\d{3})\\)?[ .-]?(\\d{3})[ .-]?(\\d{4})";
    public static final String ISO_DATE_TIME = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String ISO_DATE = "yyyy-MM-dd";
    public static final String SEPARATOR = ":=";
    private static final String ALGORITHM = "AES";
    private static final Map<Character, String> map = new LinkedHashMap<>();
    /** The markup Telegram's HTML parse mode renders — {@link #htmlToTelegram} drops everything else. */
    private static final Safelist TELEGRAM_SAFELIST = Safelist.none()
            .addTags("b", "strong", "i", "em", "u", "ins", "s", "strike", "del", "a", "code", "pre", "blockquote", "tg-spoiler")
            .addAttributes("a", "href");
    private static final String appHost = AppBeans.get(Environment.class).getProperty("app.url");
    private static final String cdnHost = AppBeans.get(Environment.class).getProperty("cdn.url");

    static {
        char[] abcCyr = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'ў', 'қ', 'ғ', 'ҳ', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'Ў', 'Қ', 'Ғ', 'Ҳ'};
        String[] abcLat = {"a", "b", "v", "g", "d", "e", "yo", "j", "z", "i", "y", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "ts", "ch", "sh", "sh", "'", "i", "", "e", "yu", "ya", "o'", "q", "g'", "h", "A", "B", "V", "G", "D", "E", "Yo", "J", "Z", "I", "Y", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "H", "Ts", "Ch", "Sh", "Sh", "'", "I", "", "E", "Yu", "Ya", "O'", "Q", "G'", "H"};
        for (int x = 0; x < abcCyr.length; x++) {
            map.put(abcCyr[x], abcLat[x]);
        }
    }

    public static String transliterate(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String clearHtml(String html) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String clearHtmlLineBreak(String html) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Makes a string safe to use as a download file name.
     * <p>
     * Names typed into a bot regularly contain newlines — 505 applicants had one at the time this
     * was written — and a newline in the file name reaches the {@code Content-Disposition} header,
     * where Spring Security's firewall rejects it ({@code Invalid characters (CR/LF) in header}).
     * The download then fails with a 500 for that person on every report. Path separators and the
     * other characters Windows forbids in a name are dropped for the same reason.
     *
     * @return the cleaned name, or {@code null} if nothing usable is left — callers should fall
     * back to their own default name in that case
     */
    @Nullable
    public static String safeFileName(@Nullable String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Rich-editor HTML to Telegram message text. Telegram's HTML parse mode understands inline
     * markup only ({@code <b>}, {@code <i>}, {@code <a>}, ...); the block tags the editor writes —
     * {@code <p>}, {@code <br>}, {@code <div>}, lists — are not line breaks to it, so a text typed
     * on several lines reached the chat as one run-on paragraph. Turns that block markup into real
     * newlines and drops every tag Telegram would not render, keeping the inline ones it does.
     * <p>
     * Send the result with {@link com.smartbox.jobster.entity.tg.Format#HTML} — what survives here
     * is markup, and without a parse mode Telegram prints the tags literally.
     */
    public static String htmlToTelegram(String html) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Sanitizes user-supplied HTML for safe rendering inside a Vaadin {@code Html} component
     * (which injects raw markup, like innerHTML). Strips {@code <script>}, {@code <img onerror>},
     * event handlers ({@code onerror}, {@code onload}, ...) and {@code javascript:} URLs while
     * keeping basic formatting tags. Use for short user texts: notifications, comments.
     */
    public static String safeHtml(String html) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Like {@link #safeHtml(String)} but for rich-editor content (vacancy descriptions, templates):
     * additionally allows images, tables and headings. Scripts and event-handler attributes are
     * still removed.
     */
    public static String safeHtmlRich(String html) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static final Pattern CSS_DECLARATION = Pattern.compile(
            "([a-zA-Z\\-][a-zA-Z0-9\\-]*\\s*:\\s*[^;{}]+?)(\\s*!important)?\\s*(?=[;}])"
    );

    private static final Pattern CSS_MARKUP = Pattern.compile("(?i)</?\\s*(style|script)\\b[^>]*>");

    /**
     * Prepares user-supplied CSS (questionnaire {@code cssOverride}) for injection into a public page
     * inside a {@code <style>} block: drops markup that could break out of the block ({@code </style>},
     * {@code <script>}) and appends {@code !important} to every declaration, so the custom rules win
     * over the default styling of the page. Returns an empty string when there is nothing to inject.
     */
    public static String safeCss(String css) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isEmpty(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isEmpty(Object value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isEmail(String email) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isPhone(String phone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isURL(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isUUID(String uuid) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isNumeric(String strNum) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean or(Object object, Object... conditions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String defaultString(String str, String emptyDefault) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean listContains(List<String> list, String... conditions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Object jsonOpt(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String makeFileUrl(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String makeFileUrl(String host, FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String makeS3FileUrl(FileRef fileRef, FileSize size) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String makeInlineFileUrl(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String makeInlinePublicFileUrl(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static FileType getFileType(String mimeType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String lastParenthesisValue(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Date makeStartDate(Date date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Date makeEndDate(Date date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OffsetDateTime makeStartDate(OffsetDateTime date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OffsetDateTime makeEndDate(OffsetDateTime date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String hideEmail(String email) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String hidePhone(String phone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String dateFormat(TemporalAccessor dateTime, String pattern) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OffsetDateTime offsetDateTimeParse(String str) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OffsetDateTime parseOffsetDateTime(String value) throws DateTimeParseException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OffsetDateTime parseOffsetDateTime(String value, String pattern) throws DateTimeParseException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <C extends Comparable<C>> int compare(C c1, C c2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String generateAlphanumericCode(int limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String generateNumericCode(int limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<String> settings2list(String settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String list2settings(List<String> list) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <T extends Collection<String>> T settings2Collection(String settings, Supplier<T> factory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public static String collection2settings(Collection<String> collection) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<String> entities2Ids(Collection<? extends JbEntity<UUID>> items) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Map<String, String> settings2map(String settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Map<String, String> toMap(CharSequence sequence, String lineSeparator) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String map2settings(Map<String, String> map) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String clearPhone(String phone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String clearString(String value, String acceptRegex) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String cleanText(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String locale(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String md5Crypt(final byte[] keyBytes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<Map<String, String>> readExcelFile(FileRef file) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<Map<String, String>> readExcelFile(Sheet sheet) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<String> excelFirstRow(Sheet sheet) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<String> excelFirstRow(FileRef file) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<String> excelFirstRow(InputStream inputStream) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <T> List<T> nonNull(List<T> list) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <K, V> Map<K, V> nonNull(Map<K, V> map) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <T> Collection<T> nonNull(Collection<T> list) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean jsonContained(JSONObject jsonObject, String key) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean jsonContainedInner(JSONObject jsonObject, String keyChain) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean jsonContainedInner(SmartTenantEntity entity, String keyChain) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OffsetDateTime localDateTime2Offset(LocalDateTime localDateTime) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OffsetDateTime localDate2Offset(LocalDate localDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String coordinates(Float latitude, Float longitude) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static SecretKey generateKey(String key) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String encrypt(String data, String key) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String decrypt(String encryptedData, String key) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // most likely to be unique
    public static String shortHash(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Integer parseIntSafe(String possiblyNumber) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Optional<UI> currentUI() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String lightenColor(String hex, double percent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void executeBackgroundUITask(Runnable runnable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void executeBackgroundTask(Runnable runnable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<UUID> transformEntity2Ids(List<? extends JbEntity<UUID>> items) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Locale getLocale(String lang) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public static String toUpperCaseByIndex(String string, Locale locale, int index) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static UUID parseUUIDSafe(String entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Long parseLongSafe(String s) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean hasHtmlTag(String html) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String ip() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String opacity(String hexColor, double opacity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static byte[] parseBase64(String base64) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String generateMD5Hash(String input) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String escapeMarkdown(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void noneSomeBtn(String viewId, Element element) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String generatePassword(int len) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
