package com.smartbox.jobster.component.translation.view;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Translate;
import com.smartbox.jobster.service.LanguageService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.EntityStates;
import io.jmix.core.Metadata;
import io.jmix.core.SaveContext;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.tabsheet.JmixTabSheet;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.richtexteditor.JmixRichTextEditor;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Route(value = "translation-view", layout = MainView.class)
@ViewController(id = "jb_TranslationView")
@ViewDescriptor(path = "translation-view.xml")
@DialogMode(width = "40em")
public class TranslationView extends StandardView {
    @Getter
    private Translate translate;

    @Setter
    private JbEntity<UUID> entity;
    @Setter
    private String fieldName;
    @Setter
    private String source;
    @Setter
    private Boolean rich;

    @Autowired
    private LanguageService languageService;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Fragments fragments;
    @Autowired
    private Metadata metadata;
    @Autowired
    private UiComponents uiComponents;

    @ViewComponent
    private JmixTabSheet tabSheet;
    @ViewComponent
    private CollectionLoader<Translate> translationDl;

    private final List<AbstractTranslationFragment> fragmentList = new ArrayList<>();
    private List<Language> languages;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "translationDl", target = Target.DATA_LOADER)
    public void onTranslationDlPostLoad(final CollectionLoader.PostLoadEvent<Translate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void defField(Translate translation, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildTab(Translate translation, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String locale(Language language) {
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

    private void validateTranslate(SaveContext context, Translate translation) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}