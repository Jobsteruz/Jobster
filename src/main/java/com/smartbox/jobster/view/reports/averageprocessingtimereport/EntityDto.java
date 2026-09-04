package com.smartbox.jobster.view.reports.averageprocessingtimereport;

import com.smartbox.jobster.entity.core.JbEntity;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record EntityDto(JbEntity<UUID>entity) implements Serializable {


    public <T> T parse(){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean equals(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public int hashCode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String key(){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
