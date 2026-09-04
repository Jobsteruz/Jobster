package com.smartbox.jobster.component.renderers;

import com.vaadin.flow.data.renderer.BasicRenderer;
import com.vaadin.flow.function.ValueProvider;

import java.io.Serializable;

/**
 * @author Jobster team
 * date: 05/07/24 10:10
 */
public class SerializableRenderer<SRC, TARGET extends Serializable> extends BasicRenderer<SRC, TARGET> {

    public SerializableRenderer(ValueProvider<SRC, TARGET> valueProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ValueProvider<SRC, TARGET> getValueProvider() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected String getFormattedValue(TARGET object) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
