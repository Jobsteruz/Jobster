package com.smartbox.jobster.view.robot.robot.condition_details;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.robot.fragments.FieldValueFragment;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.Range;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.view.*;

import java.util.ArrayList;

@Route(value = "robot-conditions-field/:id", layout = MainView.class)
@ViewController(id = "jb_RobotConditionField.detail")
@ViewDescriptor(path = "robot-condition-field-detail-view.xml")
@EditedEntityContainer("robotConditionDc")
@DialogMode(width = "35%", maxWidth = "35%")
public class RobotConditionFieldDetailView extends AbstractRobotConditionDetailView {

    @ViewComponent
    private JmixComboBox<MetaProperty> entityFieldField;
    @ViewComponent
    private FieldValueFragment conditionValue;
    @ViewComponent
    private JmixComboBox<MetaProperty> fieldField;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fieldField")
    public void onFieldFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<MetaProperty>, MetaProperty> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityFieldField")
    public void onEntityFieldFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<MetaProperty>, MetaProperty> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "fieldField", subject = "itemLabelGenerator")
    private String fieldFieldItemLabelGenerator(final MetaProperty property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityFieldField", subject = "itemLabelGenerator")
    private String entityFieldFieldItemLabelGenerator(final MetaProperty property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void setUpEntityField(MetaProperty property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}