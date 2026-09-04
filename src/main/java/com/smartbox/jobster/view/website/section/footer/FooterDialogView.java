package com.smartbox.jobster.view.website.section.footer;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.entity.web.SectionFile;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.website.WebSiteService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.combobox.ComboBox;
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
import io.jmix.flowui.component.textarea.JmixTextArea;
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

@Route(value = "footer-dialog-view", layout = MainView.class)
@ViewController("jb_FooterDialogView")
@ViewDescriptor("footer-dialog-view.xml")
@DialogMode(width = "40em")
@CssImport("./webQur/footer.css")
public class FooterDialogView extends StandardView {
    @Setter
    private Page page;
    @Setter
    private Section section;
    private SectionFile sectionFile;
    private final JSONObject nav = new JSONObject();
    private final JSONObject contact = new JSONObject();

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private WebSiteService webSiteService;

    @ViewComponent
    private VerticalLayout footerDialogNav;
    @ViewComponent
    private VerticalLayout footerConBox;
    @ViewComponent
    private JmixTextArea footerDesc;
    @ViewComponent
    private JmixTextArea footerCopyright;
    @ViewComponent
    private FileStorageUploadField upload;
    @ViewComponent
    private JmixIntegerField sortField;
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

    @Subscribe(id = "footerAddNav", subject = "clickListener")
    public void onFooterAddNavClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildNavigation(org.json.JSONObject oldValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildNavBox(String oldTitle, String oldLink) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addContactBtn", subject = "clickListener")
    public void onAddContactBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildContact(org.json.JSONObject oldValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildContactBox(String oldName, String oldLink, String oldIcon) {
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

    @Subscribe("upload")
    public void onUploadFileUploadFinished(final FileUploadFinishedEvent<FileStorageUploadField> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}