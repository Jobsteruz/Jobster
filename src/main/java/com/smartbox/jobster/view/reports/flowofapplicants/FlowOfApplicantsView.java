package com.smartbox.jobster.view.reports.flowofapplicants;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Locale;

@Route(value = "flow-of-applicants-view", layout = MainView.class)
@ViewController("jb_FlowOfApplicantsView")
@ViewDescriptor("flow-of-applicants-view.xml")
public class FlowOfApplicantsView extends AbstractHasPeriodReport {
    private boolean branchesLoadedForMultiSelect;

    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private JmixSelect<String> branchCondition;
    @ViewComponent
    private EntityComboBox<Department> branchField;
    @ViewComponent
    private JmixMultiSelectComboBox<Department> multiBranchField;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private CollectionLoader<Department> branchDl;
    @ViewComponent
    private KeyValueCollectionContainer reportContainer;

    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchField")
    public void onBranchFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Department>, Department> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionField")
    public void onPositionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchCondition")
    public void onBranchConditionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<String>,
            String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadBranchesForMultiSelect() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.date", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getBranchCondition() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}