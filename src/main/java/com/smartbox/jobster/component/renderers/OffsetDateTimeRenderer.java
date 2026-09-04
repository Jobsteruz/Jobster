package com.smartbox.jobster.component.renderers;

import com.vaadin.flow.data.renderer.BasicRenderer;
import com.vaadin.flow.function.SerializableSupplier;
import com.vaadin.flow.function.ValueProvider;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class OffsetDateTimeRenderer<SOURCE> extends BasicRenderer<SOURCE, OffsetDateTime> {

    private SerializableSupplier<DateTimeFormatter> formatter;
    private String nullRepresentation;


    public OffsetDateTimeRenderer(ValueProvider<SOURCE, OffsetDateTime> valueProvider, SerializableSupplier<DateTimeFormatter> formatter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OffsetDateTimeRenderer(ValueProvider<SOURCE, OffsetDateTime> valueProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OffsetDateTimeRenderer(ValueProvider<SOURCE, OffsetDateTime> valueProvider, SerializableSupplier<DateTimeFormatter> formatter, String nullRepresentation) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }




    protected String getFormattedValue(OffsetDateTime dateTime) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
