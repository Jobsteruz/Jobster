package com.smartbox.jobster.view.applicant.mobile;


import com.smartbox.jobster.component.mobile.ApplicantCard;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractMobileListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.Target;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "applicant-reviewed-view", layout = MainView.class)
@ViewController("jb_ApplicantReviewedView")
@ViewDescriptor("applicant-reviewed-view.xml")
public class ApplicantReviewedView extends AbstractMobileListView<Applicant> {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void onTimerTimerAction(Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoad(final CollectionLoader.PostLoadEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}