package com.smartbox.jobster.view.staffingtable;

import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "staffingTables/:id", layout = MainView.class)
@ViewController("jb_StaffingTable.detail")
@ViewDescriptor("staffing-table-detail-view.xml")
@EditedEntityContainer("staffingTableDc")
@DialogMode(width = "40em", height = "AUTO")
public class StaffingTableDetailView extends AbstractDetailView<StaffingTable> {
    @ViewComponent
    private EntityComboBox<Position> positionField;

    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @Subscribe
    public void onInitLazyOptions(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employeeField")
    public void onEmployeeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityPicker<Employee>, Employee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}