package com.smartbox.jobster.view.applicant;


import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.Supply;
import io.jmix.flowui.view.Target;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
@Route(value = "applicant-list-view-with-reject-reason", layout = MainView.class)
@ViewController(id = "jb_ApplicantListViewWithRejectReason")
@ViewDescriptor(path = "applicant-list-view-with-reject-reason.xml")
public class ApplicantListViewWithRejectReason extends ApplicantListView {
    @Autowired
    private ApplicantService applicantService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;

    private Map<UUID, CancelReason> rejectReasonCache = Collections.emptyMap();

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoadRejectReason(final CollectionLoader.PostLoadEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.rejectReason", subject = "renderer")
    private Renderer<Applicant> entityDataGridRejectReasonRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}