package com.smartbox.jobster.view.security.ipwhitelist;

import com.smartbox.jobster.entity.security.IpWhitelist;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "radius/ip-whitelists/:id", layout = MainView.class)
@ViewController("jb_IpWhitelist.detail")
@ViewDescriptor("ip-whitelist-detail-view.xml")
@EditedEntityContainer("ipWhitelistDc")
@DialogMode(width = "36em")
public class IpWhitelistDetailView extends StandardDetailView<IpWhitelist> {
}
