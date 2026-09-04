package com.smartbox.jobster.view.survey;

import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.view.*;

@Route(value = "surveys/:id", layout = MainView.class)
@ViewController("jb_Survey.detail")
@ViewDescriptor("survey-detail-view.xml")
@EditedEntityContainer("surveyDc")
@DialogMode(width = "40%")
public class SurveyDetailView extends AbstractDetailView<Survey> {
    @ViewComponent
    private JmixCheckbox activeCheckBox;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}