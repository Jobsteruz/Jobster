package com.smartbox.jobster.view.reports.averageprocessingtimereport;

import com.smartbox.jobster.entity.RoleType;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public record RoleTypeDTO(List<RoleType> roleTypes) implements Serializable {
    @Serial
    private static final long serialVersionUID = 6746583849329887783L;

    public String key() {
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
}
