package com.smartbox.jobster.view.checklist.mychecklisttasks;


import com.smartbox.jobster.bean.JbUserZonedDateTime;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.checklist.Task;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.smartbox.jobster.view.monitoring.person.EmployeeKanbanInfoView;
import com.smartbox.jobster.view.monitoring.person.KanbanInfoTab;
import com.smartbox.jobster.view.monitoring.request.RequestKanbanInfoView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.function.SerializableBiConsumer;
import com.vaadin.flow.function.SerializableSupplier;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.tabsheet.JmixTabSheet;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static com.smartbox.jobster.component.ComponentUtils.Color.GREEN;
import static com.smartbox.jobster.component.ComponentUtils.Color.RED;
import static com.smartbox.jobster.component.ComponentUtils.makeCircle;

@Route(value = "my-checklist-tasks-view", layout = MainView.class)
@ViewController(id = "jb_MyChecklistTasksView")
@ViewDescriptor(path = "my-checklist-tasks-view.xml")
public class MyChecklistTasksView extends AbstractNavigationView {

    private Employee employee;

    @Autowired
    private JbUserZonedDateTime jbUserZonedDateTime;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityService entityService;

    @ViewComponent
    private CollectionLoader<Task> applicantTasksDl;
    @ViewComponent
    private CollectionLoader<Task> employeeTasksDl;
    @ViewComponent
    private CollectionLoader<Task> vacancyTasksDl;
    @ViewComponent
    private JmixTabSheet myTasksSheet;
    @ViewComponent
    private DataGrid<Task> vacancyGrid;
    @ViewComponent
    private DataGrid<Task> employeeGrid;
    @ViewComponent
    private DataGrid<Task> applicantsGrid;
    @ViewComponent
    private MessageBundle messageBundle;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addAssignedColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("applicantsGrid")
    public void onApplicantsGridItemDoubleClick(final ItemDoubleClickEvent<Task> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employeeGrid")
    public void onEmployeeGridItemDoubleClick(final ItemDoubleClickEvent<Task> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("vacancyGrid")
    public void onVacancyGridItemDoubleClick(final ItemDoubleClickEvent<Task> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("myTasksSheet")
    public void onMyTasksSheetSelectedChange(final JmixTabSheet.SelectedChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("refreshBtn")
    public void onRefreshBtnClick(final ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull ComponentRenderer<Component, Task> getTaskDueDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "applicantsGrid.dueDate", subject = "renderer")
    private Renderer<Task> applicantsGridDueDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "employeeGrid.dueDate", subject = "renderer")
    private Renderer<Task> employeeGridDueDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "vacancyGrid.dueDate", subject = "renderer")
    private Renderer<Task> vacancyGridDueDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // lazy loading grid items on tab selection (only once)
    private void loadTabGridItems(Tab selectedTab) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadEmployeeTasks(CollectionLoader<Task> loader) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    private CollectionLoader<Task> resolveTabLoader(@Nullable Tab tab) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}