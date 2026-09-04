package com.smartbox.jobster.config;


import io.jmix.eclipselink.impl.entitycache.QueryKey;
import org.springframework.core.convert.converter.Converter;

public class QueryKeyConverter implements Converter<QueryKey, String> {
    @Override
    public String convert(QueryKey source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
