package com.smartbox.jobster.view.website.section.about;


import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "about-temp-view", layout = MainView.class)
@ViewController("jb_AboutTempView")
@ViewDescriptor("about-temp-view.xml")
@CssImport("./webQur/about-section.css")
public class AboutTempView extends StandardView {
    @Setter
    private Page page;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Dialogs dialogs;

    @Subscribe(id = "cog", subject = "clickListener")
    public void onCogClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "trash", subject = "clickListener")
    public void onTrashClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}