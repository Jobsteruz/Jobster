package com.smartbox.jobster.bean;

import io.jmix.core.security.CurrentAuthentication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.TimeZone;

@Component("jb_JbUserZonedDateTime")
@RequiredArgsConstructor
public class JbUserZonedDateTime {

    private final CurrentAuthentication currentAuthentication;

    public LocalDate currentDate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LocalDateTime currentDateTime() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OffsetDateTime currentOffsetDateTime() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // non-null
    public TimeZone userTimeZone() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
