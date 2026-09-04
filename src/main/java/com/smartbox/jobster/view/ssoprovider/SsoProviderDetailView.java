package com.smartbox.jobster.view.ssoprovider;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.sso.SsoProvider;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.Map;

@Route(value = "ssoProviders/:id", layout = MainView.class)
@ViewController("jb_SsoProvider.detail")
@ViewDescriptor("sso-provider-detail-view.xml")
@EditedEntityContainer("ssoProviderDc")
@DialogMode(width = "64em", height = "AUTO")
public class SsoProviderDetailView extends StandardDetailView<SsoProvider> {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private RoleService roleService;

    @ViewComponent
    private EntityComboBox<Company> tenantField;
    @ViewComponent
    private JmixComboBox<String> defaultRoleCodeField;

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

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("tenantField")
    public void onTenantFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Company>, Company> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "tenantField", subject = "itemLabelGenerator")
    private Object tenantFieldItemLabelGenerator(final Company company) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
