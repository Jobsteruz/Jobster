package com.smartbox.jobster.view.zpcast.templates;

import com.smartbox.jobster.entity.zpcast.Template;
import com.smartbox.jobster.entity.zpcast.TemplateField;
import com.smartbox.jobster.service.zpcast.TemplateFieldService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.zpcast.templatefield.TemplateFieldListView;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "templates_", layout = MainView.class)
@ViewController("jb_Template.list")
@ViewDescriptor("template-list-view.xml")
@DialogMode(width = "64em")
public class TemplateListView extends AbstractListView<Template> {


    @Autowired
    private TemplateFieldService templateService;
    @ViewComponent
    private DropdownButton extraButtons;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.copy")
    public void onEntityDataGridCopy(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.read")
    public void onEntityDataGridRead(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}