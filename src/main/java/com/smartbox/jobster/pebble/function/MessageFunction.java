package com.smartbox.jobster.pebble.function;


import com.smartbox.jobster.AppBeans;
import io.jmix.core.Messages;
import io.pebbletemplates.pebble.extension.Function;
import io.pebbletemplates.pebble.template.EvaluationContext;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author Jobster team
 * Since: 9/9/2024 1:36 PM
 */
@RequiredArgsConstructor
public class MessageFunction implements Function {

    private final Messages messages = AppBeans.get(Messages.class);
    private final Locale locale;

    @Override
    public Object execute(Map<String, Object> args, PebbleTemplate self, EvaluationContext context, int lineNumber) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<String> getArgumentNames() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
