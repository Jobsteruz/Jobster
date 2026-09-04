package com.smartbox.jobster.service.restservices.partnerintegration;

public record SaveResult(String platformId, String errorMessage) {

    public static SaveResult ok(String platformId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static SaveResult error(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isSuccess() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
