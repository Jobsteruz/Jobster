package com.smartbox.jobster.pojo;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgMessageType;
import lombok.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.owasp.html.HtmlPolicyBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/12/2023 1:07 PM
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TgMessagePojo implements Serializable {
    @Serial
    private static final long serialVersionUID = -7989751293438065655L;
    public static final int MAX_MESSAGE_MEDIA_SIZE = 1024;
    public static final int MAX_MESSAGE_SIZE = 4096;

    private UUID botId;

    private Long chatId;

    private String text;

    private Keyboard keyboard;

    private Boolean webPagePreview;

    private Format format;

    private String fileUrl;

    private String fileName;

    private FileType fileType;

    @Builder.Default
    private TgMessageType messageType = TgMessageType.SEND_MESSAGE;

    private Integer messageId;

    private String callbackId;

    private UUID messageHistoryId;

    private UUID massMessageId;

    private Boolean last;

    /**
     * When true, the sent message id is cached in {@code TgMessageIdsCache} even if the message
     * carries no inline keyboard, so it can later be removed by {@code killOldMessages}.
     * Used by the bot manager flow to clean up multi-message screens (resume, photo, prompts).
     */
    private boolean trackId;

    public String getText() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String sanitize(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static String convertListTagsToText(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static void processList(Document doc, String tag, boolean isOrdered) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
