package com.smartbox.jobster.view.trainee.grouptrainer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.SupportsTypedValue;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Setter;

import java.util.List;


@Route(value = "TrainerLookup", layout = MainView.class)
@ViewController("jb_TrainerLookup.list")
@ViewDescriptor("trainer-lookup-view.xml")
@LookupComponent("employeesDataGrid")
@DialogMode(width = "64em")
public class TrainerLookupView extends StandardListView<Employee> {
    @Setter
    public List<RoleType> roleTypes;

    @ViewComponent
    private CollectionLoader<Employee> employeesDl;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("searchField")
    public void onSearchFieldTypedValueChange(final SupportsTypedValue.TypedValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "employeesDataGrid.firstName", subject = "renderer")
    private Renderer<Employee> employeesDataGridFirstNameRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}