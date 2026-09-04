package com.smartbox.jobster.view.cancelreason;

import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "cancelReasons", layout = MainView.class)
@ViewController("jb_CancelReason.list")
@ViewDescriptor("cancel-reason-list-view.xml")
public class CancelReasonListView extends AbstractListView<CancelReason> {


    @Autowired
    private DialogWindows dialogWindows;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "settingsBtn", subject = "clickListener")
    public void onSettingsBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}