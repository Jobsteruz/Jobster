package com.smartbox.jobster.view.robot.fragments;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.ConditionType;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.datatype.Enumeration;
import io.jmix.core.metamodel.model.Range;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileUploadField;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@FragmentDescriptor("condition-value-fragment.xml")
public class FieldValueFragment extends RobotConditionValue {
    private static final Logger log = LoggerFactory.getLogger(FieldValueFragment.class);

    @Autowired
    private EntityService entityService;

    @ViewComponent
    private JmixIntegerField integer;
    @ViewComponent
    private FileUploadField upload;
    @ViewComponent
    private JmixCheckbox checkbox;
    @ViewComponent
    private TypedTextField<String> text;
    @ViewComponent
    private JmixSelect<Enum<?>> select;
    @ViewComponent
    private JmixMultiSelectComboBox<Enum<?>> multiSelectEnum;
    @ViewComponent
    private JmixMultiSelectComboBox<JbEntity<UUID>> multiSelectEntity;


    @Override
    public String getValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build(Object param, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build(Object param, String value, ConditionType conditionType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void handleDatatype(Range range, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("rawtypes, unchecked")
    private void handleEnum(Range range, String value, boolean useMultiSelect) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void handleClass(Range range, String value, boolean useMultiSelect) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
