package com.smartbox.jobster.view.scimtoken;

import com.smartbox.jobster.entity.sso.ScimToken;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

import java.util.UUID;

@Route(value = "scimTokens/:id", layout = MainView.class)
@ViewController("jb_ScimToken.detail")
@ViewDescriptor("scim-token-detail-view.xml")
@EditedEntityContainer("scimTokenDc")
@DialogMode(width = "40em")
public class ScimTokenDetailView extends StandardDetailView<ScimToken> {

    @Subscribe
    public void onInitEntity(final InitEntityEvent<ScimToken> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
