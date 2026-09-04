package com.smartbox.jobster;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Date: 11/15/2023 2:55 PM
 */

public class AppBeans {
    @Getter
    private static ApplicationContext applicationContext;

    private static void setApplicationContext(ApplicationContext applicationContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <T> T get(String name, Class<T> beanClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <T> T get(Class<T> beanClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static <T> T opt(Class<T> beanClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Component("jb_ApplicationContextRetriever")
    public static class ApplicationContextRetriever implements ApplicationContextAware {
        @Override
        public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}
