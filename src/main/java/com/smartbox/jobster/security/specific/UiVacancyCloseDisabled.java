package com.smartbox.jobster.security.specific;

import io.jmix.core.accesscontext.SpecificOperationAccessContext;

/**
 * Rol berilgan foydalanuvchida Vacancy "Закрыть вакансию" (close) funksiyasini yashiradi.
 * UiVacancyCreateDisabled kabi alohida policy — mavjud UiVacancyActionDisabled (Request actions) ga tegmaydi.
 */
public class UiVacancyCloseDisabled extends SpecificOperationAccessContext {

    public static final String NAME = "ui.vacancyClose.disabled";

    public UiVacancyCloseDisabled() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
