package com.smartbox.jobster.pebble.filter;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.service.TranslateService;
import io.jmix.core.InstanceNameProvider;
import io.pebbletemplates.pebble.error.PebbleException;
import io.pebbletemplates.pebble.extension.Filter;
import io.pebbletemplates.pebble.template.EvaluationContext;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public class SearchKeyFilter implements Filter {

    private final TranslateService translateService = AppBeans.get(TranslateService.class);

    private final Locale locale;


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


    private String translate(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
