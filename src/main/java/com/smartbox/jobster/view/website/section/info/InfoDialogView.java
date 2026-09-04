package com.smartbox.jobster.view.website.section.info;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import kong.unirest.json.JSONObject;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "info-dialog-view", layout = MainView.class)
@ViewController("jb_InfoDialogView")
@ViewDescriptor("info-dialog-view.xml")
@CssImport("./webQur/info-section.css")
public class InfoDialogView extends StandardView {
    @Setter
    private Page page;
    @Setter
    private Section section;
    private final JSONObject json = new JSONObject();

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DataManager dataManager;

    @ViewComponent
    private VerticalLayout infoSteps;
    @ViewComponent
    private TypedTextField<String> title;
    @ViewComponent
    private TypedTextField<String> shortTitle;
    @ViewComponent
    private JmixIntegerField sortField;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addStep", subject = "clickListener")
    public void onAddStepClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildStepBox(String num, String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void textChangeEvent(JSONObject json, String key, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}