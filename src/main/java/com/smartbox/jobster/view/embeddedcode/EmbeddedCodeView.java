package com.smartbox.jobster.view.embeddedcode;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.service.LanguageService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.codeeditor.CodeEditor;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Route(value = "embedded-code-view", layout = MainView.class)
@ViewController(id = "jb_EmbeddedCodeView")
@ViewDescriptor(path = "embedded-code-view.xml")
@DialogMode(width = "60em", height = "50em")
public class EmbeddedCodeView extends StandardView {
    @Value("${app.url}")
    private String appUrl;
    @Setter
    public Questionnaire questionnaire;
    @ViewComponent
    private InstanceContainer<Questionnaire> questionnaireDc;
    @ViewComponent
    private HorizontalLayout languageBoxId;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private LanguageService languageService;

    @ViewComponent
    private IFrame fileRefIframe;

    private String lang = "?lang=null";
    @ViewComponent
    private JmixTextArea embed;
    @ViewComponent
    private TypedTextField<String> cssLink;
    @ViewComponent
    private TypedTextField<String> bgColorField;
    @ViewComponent
    private CodeEditor cssOverrideField;
    @Autowired
    private DataManager dataManager;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setLanguages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    void refresh() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Stores the CSS entered in this dialog on the questionnaire. The public embedded page renders
     * {@code cssOverride} from the database, so the preview on the left shows exactly what the
     * visitor of the embedded form gets.
     */
    private void saveCss() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String trimToNull(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cssLink")
    public void onCssLinkComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cssOverrideField")
    public void onCssOverrideFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixTextArea, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("bgColorField")
    public void onBgColorComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}