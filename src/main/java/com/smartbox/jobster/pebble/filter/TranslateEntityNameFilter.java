package com.smartbox.jobster.pebble.filter;


import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.service.TranslateService;
import io.jmix.core.InstanceNameProvider;
import io.pebbletemplates.pebble.error.PebbleException;
import io.pebbletemplates.pebble.extension.Filter;
import io.pebbletemplates.pebble.template.EvaluationContext;
import io.pebbletemplates.pebble.template.PebbleTemplate;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 11/24/2025 3:49 PM
 */
public class TranslateEntityNameFilter implements Filter {
    public Locale locale;

    public TranslateEntityNameFilter(Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object apply(Object input, Map<String, Object> args, PebbleTemplate self, EvaluationContext context, int lineNumber) throws PebbleException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<String> getArgumentNames() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
