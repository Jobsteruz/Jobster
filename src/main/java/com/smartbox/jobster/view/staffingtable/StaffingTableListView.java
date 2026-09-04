package com.smartbox.jobster.view.staffingtable;

import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "staffingTables", layout = MainView.class)
@ViewController("jb_StaffingTable.list")
@ViewDescriptor("staffing-table-list-view.xml")
public class StaffingTableListView extends AbstractListView<StaffingTable> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}