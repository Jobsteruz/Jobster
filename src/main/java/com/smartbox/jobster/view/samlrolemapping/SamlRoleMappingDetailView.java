package com.smartbox.jobster.view.samlrolemapping;

import com.smartbox.jobster.entity.sso.SamlRoleMapping;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.Map;

@Route(value = "samlRoleMappings/:id", layout = MainView.class)
@ViewController("jb_SamlRoleMapping.detail")
@ViewDescriptor("saml-role-mapping-detail-view.xml")
@EditedEntityContainer("samlRoleMappingDc")
@DialogMode(width = "32em")
public class SamlRoleMappingDetailView extends StandardDetailView<SamlRoleMapping> {

    @Autowired
    private RoleService roleService;

    @ViewComponent
    private JmixComboBox<String> jobsterRoleCodeField;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
