package com.smartbox.jobster.component.questionfragment;

import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionWebType;
import com.smartbox.jobster.service.GenCodeService;
import com.smartbox.jobster.service.questionnaire.QuestionFormService;
import com.smartbox.jobster.view.questionnaire.question.QuestionDetailView;
import com.smartbox.jobster.view.questionnaire.question.QuestionForm;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.jmix.core.Messages;
import io.jmix.core.MetadataTools;
import io.jmix.core.SaveContext;
import io.jmix.core.UuidProvider;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.multitenancy.core.TenantProvider;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@FragmentDescriptor("question-fragment.xml")
public class QuestionFragment extends Fragment<HorizontalLayout> {

    private View<?> origin;
    private DataContext parentDataContext;
    private SaveContext saveContext;
    private CollectionContainer<Question> questions;

    @ViewComponent
    private InstanceContainer<Question> questionDc;
    @ViewComponent
    private HorizontalLayout root;
    @ViewComponent
    private Div eyeDiv;
    @ViewComponent
    private Icon setting;
    @ViewComponent
    private Icon settings;
    @ViewComponent
    private Icon trash;
    @ViewComponent
    private H4 sortField;
    @ViewComponent
    private Div webTypeDiv;
    @ViewComponent
    private HorizontalLayout box;

    @Autowired
    private QuestionFormService questionFormService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Fragments fragments;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private MetadataTools metadataTools;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private GenCodeService genCodeService;

    public void setQuestion(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void updateQuestion(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "copyBtn", subject = "clickListener")
    public void onCopyBtnClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe(id = "settings", subject = "clickListener")
    public void onSettingsClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "trash", subject = "clickListener")
    public void onTrashClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Icon getQuestionWebTypeIcon() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}




