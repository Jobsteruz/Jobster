package com.smartbox.jobster.view.tempquestion;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestion;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractMasterView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.UUID;

@Route(value = "temp-questions", layout = MainView.class)
@ViewController(id = "jb_TempQuestion.master")
@ViewDescriptor(path = "temp-question-master-view.xml")
@LookupComponent("entitiesDataGrid")
@DialogMode(width = "64em")
public class TempQuestionMasterView extends AbstractMasterView<TempQuestion> {

    private UUID tempQuestionnaire;

    @Autowired
    private EntityService entityService;

    @Subscribe
    public void onQueryParametersChange(QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void beforeSave(TempQuestion entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}