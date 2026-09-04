package com.smartbox.jobster.service.restservices.landingpage;

import org.jetbrains.annotations.NotNull;

public record ErrorDTO(String errorName) {
    @Override
    public @NotNull String toString() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
