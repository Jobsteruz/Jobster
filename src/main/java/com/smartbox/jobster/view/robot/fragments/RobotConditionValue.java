package com.smartbox.jobster.view.robot.fragments;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.service.EntityService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.html.Div;
import io.jmix.core.metamodel.datatype.EnumClass;
import io.jmix.core.metamodel.datatype.Enumeration;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.datetimepicker.TypedDateTimePicker;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.view.ViewComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.time.OffsetDateTime;
import java.util.UUID;

public abstract class RobotConditionValue extends Fragment<Div> {
    private static final Logger log = LoggerFactory.getLogger(RobotConditionValue.class);
    protected HasValueAndElement<?, ?> component;

    @Autowired
    protected EntityService entityService;

    @ViewComponent
    protected TypedDateTimePicker<OffsetDateTime> dateTime;
    @ViewComponent
    protected JmixComboBox<JbEntity<UUID>> comboBox;


    protected String getValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected abstract void build(Object param, String value);

    protected void setActiveComponent(HasValueAndElement<?, ?> hasValueAndElement) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void hideCurrentComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Enum<?> parseEnum(Enumeration<?> enumeration, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    protected String getEnumId(Enum<?> value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
