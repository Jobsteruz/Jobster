package com.smartbox.jobster.config.validator;

import com.smartbox.jobster.$;
import io.jmix.core.Messages;
import io.jmix.flowui.component.validation.Validator;
import io.jmix.flowui.exception.ValidationException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Since: 6/3/2024 5:35 PM
 */
@Component("jb_JsonValidator")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class JsonValidator implements Validator<String> {

    @Autowired
    private Messages messages;

    @Override
    public void accept(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}