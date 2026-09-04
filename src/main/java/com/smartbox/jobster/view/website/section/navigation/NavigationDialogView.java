package com.smartbox.jobster.view.website.section.navigation;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.entity.web.SectionFile;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileStorage;
import io.jmix.core.Messages;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.upload.event.FileUploadFinishedEvent;
import io.jmix.flowui.view.*;
import kong.unirest.json.JSONObject;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

@Route(value = "navigation-dialog-view", layout = MainView.class)
@ViewController("jb_NavigationDialogView")
@ViewDescriptor("navigation-dialog-view.xml")
@DialogMode(width = "42em")
@CssImport("./webQur/navigation-section.css")
public class NavigationDialogView extends StandardView {
    @Setter
    private Page page;
    @Setter
    private Section section;
    private SectionFile sectionFile;
    private final JSONObject json = new JSONObject();

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DataManager dataManager;

    @ViewComponent
    private FileStorageUploadField logo;
    @ViewComponent
    private VerticalLayout navbarBox;
    @ViewComponent
    private JmixIntegerField sortField;
    @ViewComponent
    private JmixCheckbox uzLan;
    @ViewComponent
    private JmixCheckbox engLan;
    @ViewComponent
    private JmixCheckbox rusLan;
    @Autowired
    private FileStorage fileStorage;
    @Autowired
    private Notifications notifications;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("logo")
    public void onLogoFileUploadFinished(final FileUploadFinishedEvent<FileStorageUploadField> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe(id = "addNav", subject = "clickListener")
    public void onAddNavClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildNewNavbar(String title, String link) {
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

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}