package com.smartbox.jobster.view.website;

import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.pebble.PageRenderConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;

public interface WebSectionInterface {
    Logger log = LoggerFactory.getLogger(WebSectionInterface.class);

    String buildPebble(Section section, PageRenderConfig config, int currentPage);

    @SuppressWarnings("unchecked")
    static Class<AbstractWebSection> getSectionClass(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static WebSectionInterface getSectionInstance(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    void buildSection(Section section, Page page);
}
