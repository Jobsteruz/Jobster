package com.smartbox.jobster.view.autofilltemplate;

import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.Supply;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "autoFillTemplates", layout = MainView.class)
@ViewController("jb_AutoFillTemplate.list")
@ViewDescriptor("auto-fill-template-list-view.xml")
public class AutoFillTemplateListView extends AbstractListView<AutoFillTemplate> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.body", subject = "renderer")
    private Renderer<AutoFillTemplate> entityDataGridBodyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}