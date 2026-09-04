package com.smartbox.jobster.view.company;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanyDetail;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.clone.Clone;
import com.smartbox.jobster.service.clone.CloneBuilder;
import com.smartbox.jobster.service.clone.CloneContext;
import com.vaadin.flow.component.ClickEvent;
import io.jmix.core.DataManager;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.entity.Tenant;
import io.jmix.multitenancyflowui.view.tenant.TenantDetailView;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@ViewController("mten_Tenant.detail")
@ViewDescriptor("company-detail-view.xml")
public class CompanyDetailView extends TenantDetailView {

    @ViewComponent
    private EntityPicker<User> adminField;
    @ViewComponent
    private EntityPicker<User> robotField;
    @ViewComponent
    private EntityComboBox<Company> companyField;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private JmixButton detail;
    @ViewComponent
    private JmixMultiSelectComboBox<Month> unpaidMonthsField;

    @Autowired
    private Dialogs dialogs;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Tenant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "detail", subject = "clickListener")
    public void onDetailClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private class CloneTask extends BackgroundTask<Integer, Void> {
        private final Company company;
        private final Company cloneCompany;

        public CloneTask(Company company, Company cloneCompany) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public Void run(TaskLifeCycle<Integer> taskLifeCycle) throws Exception {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}