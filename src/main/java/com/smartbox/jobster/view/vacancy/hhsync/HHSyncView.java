package com.smartbox.jobster.view.vacancy.hhsync;

import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "hh-sync-view", layout = MainView.class)
@ViewController("jb_HhSyncView")
@ViewDescriptor("hh-sync-view.xml")
@DialogMode(width = "900px")
public class HHSyncView extends StandardView {

    @ViewComponent
    private VerticalLayout box;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @com.vaadin.flow.component.ClientCallable
    public void closeDialog() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Tag("hh-sync-react")
    @JsModule("./views/hh-sync/hh-sync-web-component.tsx")
    public static class HHSyncReactComponent extends Component {
    }
}
