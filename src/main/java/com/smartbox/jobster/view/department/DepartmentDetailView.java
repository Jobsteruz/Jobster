package com.smartbox.jobster.view.department;

import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.service.BotLinkService;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "departments/:id", layout = MainView.class)
@ViewController("jb_Department.detail")
@ViewDescriptor("department-detail-view.xml")
@EditedEntityContainer("departmentDc")
@DialogMode(width = "64em", height = "AUTO")
public class DepartmentDetailView extends AbstractDetailView<Department> {

    @ViewComponent
    private CollectionLoader<Employee> headDl;
    @ViewComponent
    private EntityComboBox<Department> parentField;
    @ViewComponent
    private TypedTextField<String> phoneField;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Notifications notifications;
    @Autowired
    private BotLinkService botLinkService;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitLazyOptions(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "staffingTablesDataGrid.create", subject = "initializer")
    private void staffingTablesDataGridCreateInitializer(final StaffingTable staffingTable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "headField", subject = "itemLabelGenerator")
    private String headFieldItemLabelGenerator(final StaffingTable item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "deputyHeadField", subject = "itemLabelGenerator")
    private String deputyHeadFieldItemLabelGenerator(final StaffingTable item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Set to {@code true} by the clone flows (org chart / department & region lists) before opening this
     * view for a cloned department. When set, saving the department also creates a mirroring
     * {@link com.smartbox.jobster.entity.company.Branch} from the values entered here — see
     * {@link DepartmentService#createBranchOnCloneIfNeeded}. Left {@code false} for normal add/edit.
     */
    private boolean fromClone;

    public void setFromClone(boolean fromClone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("openMapBtn")
    public void onOpenMapBtnClick(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("generateBotLinkBtn")
    public void onGenerateBotLinkBtnClick(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("phoneField")
    public void onPhoneFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
