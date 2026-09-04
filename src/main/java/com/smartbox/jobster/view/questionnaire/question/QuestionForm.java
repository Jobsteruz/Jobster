package com.smartbox.jobster.view.questionnaire.question;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.CardComponent;
import com.smartbox.jobster.component.questionfragment.QuestionFragment;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionWebType;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.sortablelayout.QuestionnaireSortableLayout;
import com.smartbox.jobster.sortablelayout.SortableConfig;
import com.smartbox.jobster.sortablelayout.SortableGroupStore;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;

@Route(value = "question-form/:id", layout = MainView.class)
@ViewController("jb_QuestionForm")
@ViewDescriptor("question-form.xml")
public class QuestionForm extends StandardView {
    private final SortableGroupStore sortableGroupStore = new SortableGroupStore();
    public final VerticalLayout questionForm = new VerticalLayout();
    private final VerticalLayout questions = new VerticalLayout();
    private final VerticalLayout questionType = new VerticalLayout();
    private Questionnaire questionnaire = null;
    private SaveContext saveContext = new SaveContext();

    @ViewComponent
    private CollectionContainer<Question> questionsDc;
    @ViewComponent
    private CollectionLoader<Question> questionsDl;
    @ViewComponent
    private VerticalLayout questionTypeBox;
    @ViewComponent
    private HorizontalLayout questionBox;
    @ViewComponent
    private DataContext dataContext;

    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Fragments fragments;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private Notifications notifications;

    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addQuestionType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CardComponent cloneCardComponent(Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildDropBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildQuestionCard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QuestionFragment getFragment(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveAction")
    public void onSaveAction(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cancelAction")
    public void onCancelAction(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void reload() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void updateSort(int index) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void update() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sortDataContainerItems() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}