package com.smartbox.jobster.security.specific;

import io.jmix.core.accesscontext.SpecificOperationAccessContext;

public class UiVacancyCreateDisabled extends SpecificOperationAccessContext {

    public static final String NAME = "ui.vacancyCreate.disabled";

    public UiVacancyCreateDisabled() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
