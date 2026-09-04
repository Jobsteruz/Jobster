package com.smartbox.jobster.pojo;


import lombok.Getter;
import lombok.Setter;

/**
 * @author Jobster team
 * Since: 11/21/2024 4:59 PM
 */
@Getter
@Setter
public class TgMessagePart {
    Integer size = TgMessagePojo.MAX_MESSAGE_SIZE;
    String text;
    String part;

    public TgMessagePart(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TgMessagePart(String text, Integer size) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
