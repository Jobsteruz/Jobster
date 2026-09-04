package com.smartbox.jobster.view.tempquestion;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.questionnaire.temp.TempAnswer;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestion;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.sortablelayout.SortableConfig;
import com.smartbox.jobster.sortablelayout.SortableLayout;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@Route(value = "tempQuestions", layout = MainView.class)
@ViewController("jb_TempQuestion.list")
@ViewDescriptor("temp-question-list-view.xml")
@DialogMode(width = "64em")
public class TempQuestionListView extends StandardListView<TempQuestion> {
    @Setter
    private TempQuestionnaire tempQuestionnaire;
    private final VerticalLayout questions = new VerticalLayout();

    @ViewComponent
    private VerticalLayout questionsLayout;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Messages messages;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    private SaveContext saveContext = new SaveContext();

    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeClose(final BeforeCloseEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div buildTempQuestionCards(TempQuestion tempQuestion, int order) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div getAnswersDiv(Div answers, TempQuestion tempQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "tempQuestionCreateBtn", subject = "singleClickListener")
    public void onCreateBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private TempQuestion getTempQuestion(Div div) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

