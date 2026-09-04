package com.smartbox.jobster.view.checklist;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.checklist.Checklist;
import com.smartbox.jobster.entity.checklist.Task;
import com.smartbox.jobster.entity.checklist.TaskCancelReason;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.ChecklistService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import io.jmix.core.Messages;
import io.jmix.core.Metadata;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;
import java.util.UUID;

@FragmentDescriptor("checklist-fragment.xml")
public class ChecklistFragment extends Fragment<VerticalLayout> {
    private Employee currentEmployee;
    private JbEntity<UUID> jbEntity;
    private Checklist checklist;
    private String locale;

    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private ChecklistService checklistService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private Messages messages;
    @Autowired
    private Metadata metadata;

    @ViewComponent
    private CollectionContainer<Task> tasksDc;
    @ViewComponent
    private CollectionLoader<Task> tasksDl;
    @ViewComponent
    private NativeLabel name;
    @ViewComponent
    private Div progress;
    @ViewComponent
    private Span score;
    @ViewComponent
    private VerticalLayout tasks;

    public void setChecklist(Checklist checklist, JbEntity<UUID> jbEntity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeProgress() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private double calculateStops() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void taskLayout(Task task) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Avatar makeAssignedAvatar(Task task) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    private void createInputDialogAndSaveTask(Boolean value, Task task, RadioButtonGroup<Boolean> check) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}