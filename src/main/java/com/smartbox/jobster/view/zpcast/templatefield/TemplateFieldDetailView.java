package com.smartbox.jobster.view.zpcast.templatefield;

import com.smartbox.jobster.entity.zpcast.TemplateField;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "templateFields/:id", layout = MainView.class)
@ViewController("jb_TemplateField.detail")
@ViewDescriptor("template-field-detail-view.xml")
@EditedEntityContainer("templateFieldDc")
@DialogMode(width = "32em", height = "AUTO")
public class TemplateFieldDetailView extends AbstractDetailView<TemplateField> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}