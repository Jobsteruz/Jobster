package com.smartbox.jobster.config.validator;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.service.security.PasswordPolicyService;
import io.jmix.core.Messages;
import io.jmix.securityflowui.password.PasswordValidationContext;
import io.jmix.securityflowui.password.PasswordValidationException;
import io.jmix.securityflowui.password.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Date: 31/01/24 14:29
 */
@Component
public class AppPasswordValidator implements PasswordValidator<User> {
    final String STRONG_PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

    @Autowired
    private Messages messages;
    @Autowired
    private PasswordPolicyService passwordPolicyService;

    @Override
    public void validate(PasswordValidationContext<User> context) throws PasswordValidationException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
