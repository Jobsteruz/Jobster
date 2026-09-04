package com.smartbox.jobster.view.survey.sendsurvey;


import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.pojo.SurveyPojo;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Route(value = "send-survey-view", layout = MainView.class)
@ViewController("jb_SendSurveyView")
@ViewDescriptor("send-survey-view.xml")
@DialogMode(width = "25%")
public class SendSurveyView extends StandardView {
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.survey.routing-key}")
    private String routingKey;

    @Setter
    private UUID surveyId;

    @Autowired
    private ApplicantService applicantService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private Dialogs dialogs;

    @ViewComponent
    private VerticalLayout employeeLayout;
    @ViewComponent
    private JmixRadioButtonGroup<PersonType> personRadioButton;
    @ViewComponent
    private JmixMultiSelectComboBox<RoleType> roleTypeComboBox;
    @ViewComponent
    private VerticalLayout applicantLayout;
    @ViewComponent
    private JmixMultiSelectComboBox<Department> branchComboBoxEmp;
    @ViewComponent
    private JmixMultiSelectComboBox<Position> positionsComboBoxEmp;
    @ViewComponent
    private MessageBundle messageBundle;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("personRadioButton")
    public void onPersonRadioButtonComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixRadioButtonGroup<PersonType>, PersonType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "send", subject = "clickListener")
    public void onSendClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}