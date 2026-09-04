package com.smartbox.jobster.view.tempquestioncondition;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.temp.TempAnswer;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestion;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionCondition;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

@Route(value = "temp-question-conditions/:id", layout = MainView.class)
@ViewController(id = "jb_TempQuestionCondition.detail")
@ViewDescriptor(path = "temp-question-condition-detail-view.xml")
@EditedEntityContainer("tempQuestionConditionDc")
@DialogMode(width = "30em", height = "AUTO")
public class TempQuestionConditionDetailView extends AbstractDetailView<TempQuestionCondition> {
    @ViewComponent
    private EntityComboBox<TempQuestion> conditionQuestionField;
    @ViewComponent
    private CollectionLoader<TempQuestion> questionDl;
    @ViewComponent
    private VerticalLayout selectConditions;
    @Autowired
    private UiComponents uiComponents;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("conditionQuestionField")
    public void onConditionQuestionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<TempQuestion>, TempQuestion> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "skippedField", subject = "clickListener")
    public void onSkippedFieldClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Component getValueComponent(TempQuestion question, TempQuestionCondition condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setValue(TempQuestionCondition questionCondition, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initializeComboBoxWithValue(TempQuestionCondition questionCondition, JmixMultiSelectComboBox<String> conditionField) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Set<String> getAvailableValues(TempQuestion question, TempQuestionCondition currentCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Set<String> getAlreadySelectedValues(TempQuestion question, TempQuestionCondition currentCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}