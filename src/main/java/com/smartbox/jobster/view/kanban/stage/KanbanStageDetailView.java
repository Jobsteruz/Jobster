package com.smartbox.jobster.view.kanban.stage;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.componentfactory.ToggleButton;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.addons.tatu.ColorPicker;

@Route(value = "kanbanStages/:id", layout = MainView.class)
@ViewController("jb_KanbanStage.detail")
@ViewDescriptor("kanban-stage-detail-view.xml")
@EditedEntityContainer("kanbanStageDc")
@DialogMode(width = "40em", height = "AUTO")
public class KanbanStageDetailView extends AbstractDetailView<KanbanStage> {
    @ViewComponent
    private HorizontalLayout colorField;
    @ViewComponent
    private HorizontalLayout reserveBox;
    @ViewComponent
    private HorizontalLayout rejectBox;
    @ViewComponent
    private HorizontalLayout blacklistBox;
    @ViewComponent
    private HorizontalLayout admitBox;
    @ViewComponent
    private HorizontalLayout hireBox;
    @ViewComponent
    private HorizontalLayout convertBox;
    @ViewComponent
    private HorizontalLayout exitInterviewBox;

    @ViewComponent
    private VerticalLayout otherActions;
    @Autowired
    private UiComponents uiComponents;
    @ViewComponent
    private JmixIntegerField widthField;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<KanbanStage> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ToggleButton buildToggleButton(Boolean value, String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private HorizontalLayout buildOtherToggle(Boolean value, String id, String title) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}