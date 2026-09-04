package com.smartbox.jobster.view.robot.robot.condition_details;

import com.smartbox.jobster.entity.robot.ConditionType;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.Install;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "robot-quiz-conditions/:id", layout = MainView.class)
@ViewController(id = "jb_RobotConditionQuiz.detail")
@ViewDescriptor(path = "robot-condition-quiz-detail-view.xml")
@EditedEntityContainer("robotConditionDc")
public class RobotConditionQuizDetailView extends AbstractRobotConditionDetailView {


    @Install(to = "conditionTypeField", subject = "itemEnabledProvider")
    private boolean conditionTypeFieldItemEnabledProvider(final ConditionType conditionType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}