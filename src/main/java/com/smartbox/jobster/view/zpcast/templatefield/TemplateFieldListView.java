package com.smartbox.jobster.view.zpcast.templatefield;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.zpcast.Template;
import com.smartbox.jobster.entity.zpcast.TemplateField;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "templates_/fields", layout = MainView.class)
@ViewController("jb_TemplateField.list")
@ViewDescriptor("template-field-list-view.xml")
public class TemplateFieldListView extends AbstractListView<TemplateField> {


    private UUID templateId;

    @Autowired
    private EntityService entityService;
    @ViewComponent
    private MessageBundle messageBundle;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}