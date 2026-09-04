package com.smartbox.jobster.validators;

import com.smartbox.jobster.$;
import io.jmix.flowui.component.validation.Validator;
import io.jmix.flowui.exception.ValidationException;
import io.jmix.flowui.view.MessageBundle;
import org.springframework.stereotype.Component;

@Component
public class PhoneValidator implements Validator<String> {
    private final MessageBundle messageBundle;

    public PhoneValidator(MessageBundle messageBundle) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void accept(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
