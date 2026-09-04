package com.smartbox.jobster.view.menu;


import com.flowingcode.vaadin.addons.twincolgrid.TwinColGrid;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.tg.Menu;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Route(value = "menu-branch-view", layout = MainView.class)
@ViewController(id = "jb_MenuBranchView")
@ViewDescriptor(path = "menu-branch-view.xml")
@DialogMode(width = "40em", height = "40em")
public class MenuBranchView extends StandardView {
    private TwinColGrid<Department> twinColumn;

    @Setter
    public Menu menu;

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EntityService entityService;

    @ViewComponent
    private VerticalLayout grid;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchTypeField")
    public void onBranchTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<BranchType>, BranchType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private TwinColGrid<Department> makeTwinColumn(BranchType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}