package com.smartbox.jobster.view.ssoprovider;

import com.smartbox.jobster.entity.sso.SsoProvider;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "ssoProviders", layout = MainView.class)
@ViewController("jb_SsoProvider.list")
@ViewDescriptor("sso-provider-list-view.xml")
@LookupComponent("ssoProvidersDataGrid")
@DialogMode(width = "64em")
public class SsoProviderListView extends StandardListView<SsoProvider> {
}
