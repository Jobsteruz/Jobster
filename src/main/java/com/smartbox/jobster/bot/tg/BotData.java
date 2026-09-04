package com.smartbox.jobster.bot.tg;

import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/2/2023 1:26 PM
 */
public interface BotData {

    String MENU = "MENU_";
    String LANGUAGE = "LANGUAGE_";
    String QUESTIONNAIRE = "QNR_";

    String UN_SELECTION_ICON = "⚪️";
    String SELECTION_ICON = "\uD83D\uDD18";

    default UUID fetchId(String data, String prefix) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
