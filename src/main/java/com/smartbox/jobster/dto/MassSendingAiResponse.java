package com.smartbox.jobster.dto;

import java.io.Serializable;
import java.util.List;

public record MassSendingAiResponse(
        String fileType, // PHOTO, DOCUMENT, AUDIO, ANIMATION, VIDEO
        String message,
        String date,
        Boolean alsoBlocked,
        Boolean alsoEmployee,
        Boolean onlyNotApplicant,
        Boolean onlyRejected,
        Boolean onlyReserved,
        List<String> platforms // TELEGRAM, SMS, EMAIL
) implements Serializable {
}
