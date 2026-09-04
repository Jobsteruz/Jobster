package com.smartbox.jobster.entity.core;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.postgresql.util.PGobject;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * @author Jobster team
 * Since: 6/3/2024 5:53 PM
 */
@Converter
public class SmartJsonConverter implements AttributeConverter<String, PGobject>, Serializable {
    private static final long serialVersionUID = -1960352232844982290L;

    @Override
    public PGobject convertToDatabaseColumn(String object) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String convertToEntityAttribute(PGobject object) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}