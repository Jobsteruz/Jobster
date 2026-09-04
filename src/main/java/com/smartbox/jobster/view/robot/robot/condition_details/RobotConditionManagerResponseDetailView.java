package com.smartbox.jobster.view.robot.robot.condition_details;

import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.robot.ConditionType;
import com.smartbox.jobster.robot.builders.ConditionMatcherBuilder;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "robot-manager-response-conditions/:id", layout = MainView.class)
@ViewController(id = "jb_RobotConditionManagerResponse.detail")
@ViewDescriptor(path = "robot-condition-manager-response-detail-view.xml")
@EditedEntityContainer("robotConditionDc")
public class RobotConditionManagerResponseDetailView extends AbstractRobotConditionDetailView {

    private static final List<PersonStatus> AVAILABLE_STATUSES = List.of(
            PersonStatus.ACCEPTED, PersonStatus.REJECTED, PersonStatus.RESERVED
    );

    @Autowired
    private Messages messages;

    @ViewComponent
    private JmixSelect<PersonStatus> statusField;
    @ViewComponent
    private JmixSelect<ConditionType> conditionTypeField;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("conditionTypeField")
    public void onConditionTypeFieldChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ConditionType>, ConditionType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "conditionTypeField", subject = "itemEnabledProvider")
    private boolean conditionTypeFieldItemEnabledProvider(final ConditionType conditionType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateStatusVisibility() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
