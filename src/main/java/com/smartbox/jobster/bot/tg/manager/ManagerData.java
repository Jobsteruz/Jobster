package com.smartbox.jobster.bot.tg.manager;


import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/23/2025 11:11 AM
 */
public interface ManagerData {

    String MANAGER = "MGR_";
    String POSITION = MANAGER + "POSITION_";

    String PERSON = MANAGER + "PERSON_";
    String PERSON_ACCEPT = PERSON + "ACCEPT_";
    String PERSON_REJECT = PERSON + "REJECT_";
    String PERSON_RESERVE = PERSON + "RESERVE_";
    String PERSON_HISTORY = PERSON + "HISTORY_";
    String PERSON_CANCEL = PERSON + "CANCEL_";

    String PENDING = MANAGER + "PENDING_";
    String PENDING_START = PENDING + "START_";

    String RESERVED = MANAGER + "RESERVED_";
    String RESERVED_START = RESERVED + "START_";

    String RESERVED_POSITION = RESERVED + "POSITION_";
    String RESERVED_POSITION_START = RESERVED_POSITION + "START_";

    String REVIEWED = MANAGER + "REVIEWED_";
    String REVIEWED_START = REVIEWED + "START_";

    String HISTORY = MANAGER + "HISTORY_";
    String HISTORY_START = HISTORY + "START_";

    default Integer fetchStart(String data, String prefix) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default UUID fetchUUID(String data, String prefix) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
