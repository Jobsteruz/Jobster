package com.smartbox.jobster.pebble;

import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.pebble.filter.SearchKeyFilter;
import com.smartbox.jobster.pebble.filter.TranslateEntityFilter;
import com.smartbox.jobster.pebble.filter.TranslateEnumFilter;
import com.smartbox.jobster.pebble.function.EntityFunction;
import com.smartbox.jobster.pebble.function.FileUrlFunction;
import com.smartbox.jobster.pebble.function.GenerateUrlFunction;
import com.smartbox.jobster.pebble.function.MessageFunction;
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
 * @author Jobster team
 * Since: 11/5/2024 5:34 PM
 */
public class WebSiteExtension implements Extension {
    public PageRenderConfig config;

    public WebSiteExtension(PageRenderConfig config) {
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

    private Locale getLocale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
