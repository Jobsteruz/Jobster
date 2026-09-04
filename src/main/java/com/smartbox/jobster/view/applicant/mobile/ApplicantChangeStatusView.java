package com.smartbox.jobster.view.applicant.mobile;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.service.ApplicantStatusChangeService;
import com.smartbox.jobster.service.CancelReasonService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.kanban.ManagerAcceptStageTransferService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.TimeSource;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "applicant-change-status-view", layout = MainView.class)
@ViewController("jb_ApplicantChangeStatusView")
@ViewDescriptor("applicant-change-status-view.xml")
public class ApplicantChangeStatusView extends StandardView {
    @Setter
    private boolean accept;
    @Setter
    private Applicant applicant;
    @Setter
    private Kanban kanban;

    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    private ManagerAcceptStageTransferService managerAcceptStageTransferService;
    @ViewComponent
    private H5 fullName;
    @ViewComponent
    private Span confirm;
    @ViewComponent
    private JmixSelect<CancelReason> cancelReason;
    @ViewComponent
    private JmixTextArea commentary;
    @ViewComponent
    private JmixButton acceptBtn;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private Messages messages;
    @Autowired
    private ApplicantStatusChangeService applicantStatusChangeService;
    @Autowired
    private CancelReasonService cancelReasonService;


    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "acceptBtn", subject = "clickListener")
    public void onAcceptClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}