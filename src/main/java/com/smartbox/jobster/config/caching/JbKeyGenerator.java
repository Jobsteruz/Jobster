package com.smartbox.jobster.config.caching;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author Jobster team
 * date: 27/07/24 15:51
 */
@Component("jb_KeyGenerator")
public class JbKeyGenerator implements KeyGenerator, JbCacheKeyMaker {

    @Override
    @NonNull
    public Object generate(Object target, Method method, Object... params) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @NonNull
    public Object generate(Object... params) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}