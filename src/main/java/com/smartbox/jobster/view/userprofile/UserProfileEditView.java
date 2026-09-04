package com.smartbox.jobster.view.userprofile;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.event.UserEvent;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.auth.login_locale.LoginLocales;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.DataManager;
import io.jmix.core.Id;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.UiEventPublisher;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import jakarta.persistence.LockModeType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@Route(value = "user-profile-view/:id", layout = MainView.class)
@ViewController("jb_UserProfile.detail")
@ViewDescriptor("user-profile-edit-view.xml")
@EditedEntityContainer("employeeDc")
public class UserProfileEditView extends AbstractDetailView<Employee> {
    private TreeComboBox<Navigation> navigationTreeBox;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private EntityService entityService;
    @ViewComponent
    private MessageBundle messageBundle;

    @ViewComponent
    private JmixComboBox<String> timeZoneId;
    @ViewComponent
    private JmixSelect<LoginLocales> locales;
    @ViewComponent
    private CollectionContainer<Navigation> navigationDc;
    @ViewComponent
    private VerticalLayout editableLayout;
    @Autowired
    private UiEventPublisher uiEventPublisher;


    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}