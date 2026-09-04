package com.smartbox.jobster.pebble.function;

import com.smartbox.jobster.$;
import com.smartbox.jobster.pebble.PageRenderConfig;
import io.pebbletemplates.pebble.extension.Function;
import io.pebbletemplates.pebble.template.EvaluationContext;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 19/03/2025 13:28 AM
 */
@RequiredArgsConstructor
public class GenerateUrlFunction implements Function {

    private final PageRenderConfig config;

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
