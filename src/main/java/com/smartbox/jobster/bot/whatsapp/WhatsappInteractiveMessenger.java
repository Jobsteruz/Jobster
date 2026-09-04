package com.smartbox.jobster.bot.whatsapp;

import com.smartbox.jobster.$;
import com.whatsapp.api.domain.messages.*;
import com.whatsapp.api.domain.messages.type.ButtonType;
import com.whatsapp.api.domain.messages.type.InteractiveMessageType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public interface WhatsappInteractiveMessenger extends WhatsappComponent {

    private static String cutExtraInlineContent(String content, int max) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default Message makeKeyboard(Collection<InlineMarkup> buttonsList) throws InlineExceededException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default Message makeKeyboard(Collection<InlineMarkup> buttonsList, List<InlineMarkup> extraButtonsList) throws InlineExceededException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    default Message makeKeyboard(Collection<InlineMarkup> markups, Collection<InlineMarkup> extras, Body body, Header header, Footer footer) throws InlineExceededException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default Message makeKeyboard(Collection<InlineMarkup> markups, Body body, Header header, Footer footer) throws InlineExceededException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private InteractiveMessage makeButtonReplies(List<InlineMarkup> markupList, Body body, Header header, Footer footer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default InteractiveMessage makeListReplies(List<InlineMarkup> markupList, Body body, Header header, Footer footer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default Header getMessageHeader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default Footer getMessageFooter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default void fillMessage(InteractiveMessage message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default String sendLocationRequest() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
