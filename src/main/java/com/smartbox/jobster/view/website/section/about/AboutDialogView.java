package com.smartbox.jobster.view.website.section.about;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Section;
import com.smartbox.jobster.entity.web.SectionFile;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.component.richtexteditor.RichTextEditor;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import kong.unirest.json.JSONObject;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "about-dialog-view", layout = MainView.class)
@ViewController("jb_AboutDialogView")
@ViewDescriptor("about-dialog-view.xml")
@CssImport("./webQur/about-section.css")
public class AboutDialogView extends StandardView {
    @Setter
    private Page page;
    @Setter
    private Section section;
    private SectionFile sectionFile;

    @Autowired
    private DataManager dataManager;

    @ViewComponent
    private TypedTextField<Object> title;
    @ViewComponent
    private TypedTextField<Object> shortTitle;
    @ViewComponent
    private TypedTextField<Object> actionTitle;
    @ViewComponent
    private TypedTextField<Object> actionLink;
    @ViewComponent
    private FileStorageUploadField image;
    @ViewComponent
    private RichTextEditor desc;
    @ViewComponent
    private JmixIntegerField sortField;

    @Subscribe
    public void onReady(final ReadyEvent event) {
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