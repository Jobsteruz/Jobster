package com.smartbox.jobster.pebble;


import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.pebble.function.FormatDateFunction;
import com.smartbox.jobster.pebble.function.MessageFunction;
import com.smartbox.jobster.pebble.function.ToJsonFunction;
import com.smartbox.jobster.pebble.function.ToUpperCaseFunction;
import io.pebbletemplates.pebble.attributes.AttributeResolver;
import io.pebbletemplates.pebble.extension.*;
import io.pebbletemplates.pebble.operator.BinaryOperator;
import io.pebbletemplates.pebble.operator.UnaryOperator;
import io.pebbletemplates.pebble.tokenParser.TokenParser;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Author: Clean
 * Since: 13/03/2025 5:21 PM
 */
public class BotAttendanceExtension implements Extension {
    public Locale locale;

    public BotAttendanceExtension(String lang) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Map<String, Filter> getFilters() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Map<String, Test> getTests() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Map<String, Function> getFunctions() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<TokenParser> getTokenParsers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<BinaryOperator> getBinaryOperators() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<UnaryOperator> getUnaryOperators() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Map<String, Object> getGlobalVariables() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<NodeVisitorFactory> getNodeVisitors() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<AttributeResolver> getAttributeResolver() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
