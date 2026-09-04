package com.smartbox.jobster.view.auth.login_locale;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;

import java.util.Locale;


@Getter
public enum LoginLocales implements EnumClass<String> {

    RUSSIAN("ru", "images/login/ru.svg"),
    ENGLISH("en", "images/login/en.svg"),
    UZBEK("uz", "images/login/uz.svg");

    private final String id;
    private final String flagPath;

    LoginLocales(String id, String flagPath) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Locale getLocale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static LoginLocales fromId(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}