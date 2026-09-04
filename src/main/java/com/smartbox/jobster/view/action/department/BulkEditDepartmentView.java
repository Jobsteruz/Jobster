package com.smartbox.jobster.view.action.department;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.company.DepartmentEditableField;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@Route(value = "bulk-edit-department-view", layout = MainView.class)
@ViewController("jb_BulkEditDepartmentView")
@ViewDescriptor("bulk-edit-department-view.xml")
@DialogMode(width = "450px", height = "AUTO")
public class BulkEditDepartmentView extends StandardView {

    @Setter
    private Set<Department> editedDepartments;

    @ViewComponent
    private JmixComboBox<DepartmentEditableField> fieldSelector;
    @ViewComponent
    private EntityComboBox<DepartmentCategory> categoryField;
    @ViewComponent
    private EntityComboBox<Employee> headField;
    @ViewComponent
    private EntityComboBox<Region> regionField;
    @ViewComponent
    private EntityComboBox<Department> parentField;
    @ViewComponent
    private EntityComboBox<PersonCategory> personCategoryField;
    @ViewComponent
    private EntityComboBox<BranchType> branchTypeField;
    @ViewComponent
    private JmixSelect<DepartmentType> typeField;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;


    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fieldSelector")
    public void onFieldSelectorComponentValueChange(
            final AbstractField.ComponentValueChangeEvent<JmixComboBox<DepartmentEditableField>, DepartmentEditableField> event) {
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

    /**
     * Tekshiradi: potentialDescendant ning hierarchicalKey ancestor ning hierarchicalKey bilan boshlanadimi
     * (ya'ni potentialDescendant ancestor ning bolasi yoki nabirasi)
     */
    private boolean isDescendant(Department ancestor, Department potentialDescendant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

