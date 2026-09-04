package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.view.View;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

@org.springframework.stereotype.Component("jb_ClosedApplicantsColumnHelper")
public class ClosedApplicantsColumnHelper {

    private static final int AVATAR_LIMIT = 5;

    @Autowired
    private DataManager dataManager;

    public Map<UUID, List<Applicant>> loadByRequestIds(Collection<UUID> requestIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Map<UUID, List<Applicant>> loadByVacancyIds(Collection<UUID> vacancyIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Component createAvatarLayout(List<Applicant> applicants, String dialogTitle,
                                        View<?> parentView, DialogWindows dialogWindows) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void openDialog(List<Applicant> applicants, String headerTitle,
                           View<?> parentView, DialogWindows dialogWindows) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Avatar createAvatar(Applicant applicant, String size) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
