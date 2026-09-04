package com.smartbox.jobster.view.applicant.mobile;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.mobile.ApplicantStageHistoryCard;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.model.InstanceLoader;
import io.jmix.flowui.view.*;

import java.util.UUID;

@Route(value = "applicant-history-view", layout = MainView.class)
@ViewController("jb_ApplicantHistoryView")
@ViewDescriptor("applicant-stage-history-view.xml")
public class ApplicantStageHistoryView extends StandardView {

    @ViewComponent
    private InstanceLoader<Applicant> applicantDl;
    @ViewComponent
    private CollectionLoader<KanbanStageHistory> stageHistoriesDl;
    @ViewComponent
    private InstanceContainer<Applicant> applicantDc;
    @ViewComponent
    private Avatar photo;
    @ViewComponent
    private H4 fullName;
    @ViewComponent
    private H2 applicantFullName;
    @ViewComponent
    private CollectionContainer<KanbanStageHistory> stageHistoriesDc;
    @ViewComponent
    private VerticalLayout histories;

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setApplicantFields() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}