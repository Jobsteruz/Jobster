package com.smartbox.jobster.exceptions.ui;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.exceptions.EntityExistsException;
import io.jmix.flowui.exception.AbstractUiExceptionHandler;
import org.springframework.stereotype.Component;

@Component
public class EntityExistsExceptionHandler  extends AbstractUiExceptionHandler {


    public EntityExistsExceptionHandler() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void doHandle(String className, String message, Throwable throwable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}