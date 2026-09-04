package com.smartbox.jobster.view.security.ipwhitelist;

import com.smartbox.jobster.entity.security.IpWhitelist;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "radius/ip-whitelists", layout = MainView.class)
@ViewController("jb_IpWhitelist.list")
@ViewDescriptor("ip-whitelist-list-view.xml")
@LookupComponent("ipWhitelistsDataGrid")
@DialogMode(width = "64em")
public class IpWhitelistListView extends StandardListView<IpWhitelist> {
}
