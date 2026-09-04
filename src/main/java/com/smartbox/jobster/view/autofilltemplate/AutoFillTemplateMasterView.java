package com.smartbox.jobster.view.autofilltemplate;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.abstractview.AbstractMasterView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.shared.Tooltip;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "autoFillTemplatesMaster", layout = MainView.class)
@ViewController("jb_AutoFillTemplate.master")
@ViewDescriptor("auto-fill-template-master-view.xml")
@LookupComponent("entitiesDataGrid")
@DialogMode(width = "64em")
public class AutoFillTemplateMasterView extends AbstractMasterView<AutoFillTemplate> {
    @ViewComponent
    private CodeField codeField;
    @ViewComponent
    private JmixButton bodyInfoBtn;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onAutoFillTemplateInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entitiesDataGrid.body", subject = "renderer")
    private Renderer<AutoFillTemplate> entitiesDataGrid() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onEntitiesDataGridCreate(ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onEntitiesDataGridDataGridItemClick(ItemClickEvent<AutoFillTemplate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "clearCache", subject = "clickListener")
    public void onClearCacheClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static void setupBodyInfoTooltip(JmixButton btn, Messages messages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
