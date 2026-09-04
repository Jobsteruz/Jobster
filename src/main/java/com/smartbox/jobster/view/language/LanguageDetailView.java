package com.smartbox.jobster.view.language;

import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.service.LanguageService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "languages/:id", layout = MainView.class)
@ViewController("jb_Language.detail")
@ViewDescriptor("language-detail-view.xml")
@EditedEntityContainer("languageDc")
@DialogMode(width = "40em", height = "AUTO")
public class LanguageDetailView extends AbstractDetailView<Language> {

    @ViewComponent
    private JmixCheckbox isDefaultField;
    @Autowired
    private LanguageService languageService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private TenantProvider tenantProvider;


    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("isDefaultField")
    public void onIsDefaultFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixCheckbox, Boolean> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}