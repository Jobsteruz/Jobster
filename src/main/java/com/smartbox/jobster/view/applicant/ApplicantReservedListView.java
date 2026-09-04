package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.security.specific.UiFilterByDepartment2Enabled;
import com.smartbox.jobster.security.specific.UiFilterByDepartmentEnabled;
import com.smartbox.jobster.security.specific.UiFilterByResponsibleEnabled;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.FetchPlan;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Route(value = "applicantsReserved", layout = MainView.class)
@ViewController(id = "jb_ApplicantReserved.list")
@ViewDescriptor(path = "applicant-reserved-list-view.xml")
public class ApplicantReservedListView extends AbstractApplicantListView {


    @Setter
    private Kanban kanban;

    public void setFilter(Position position, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Kanban getKanban() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}