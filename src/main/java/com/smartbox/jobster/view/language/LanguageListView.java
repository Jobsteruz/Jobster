package com.smartbox.jobster.view.language;

import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHEmployerService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.Install;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "languages", layout = MainView.class)
@ViewController("jb_Language.list")
@ViewDescriptor("language-list-view.xml")
public class LanguageListView extends AbstractListView<Language> {


    @Autowired
    private HHEmployerService hHEmployerService;
    @Autowired
    private UserService userService;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("sync")
    public void onSync(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityDataGrid.remove", subject = "enabledRule")
    private boolean entityDataGridRemoveEnabledRule() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}