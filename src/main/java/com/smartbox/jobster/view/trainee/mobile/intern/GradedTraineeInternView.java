package com.smartbox.jobster.view.trainee.mobile.intern;


import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "graded-trainee-intern-view", layout = MainView.class)
@ViewController("jb_GradedTraineeInternView")
@ViewDescriptor("graded-trainee-intern-view.xml")
public class GradedTraineeInternView extends AbstractTraineeInternView {
    public static final String VIEW_ROUTE = "graded";

    @Override
    protected String getViewRoute() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected VerticalLayout buildCard(TraineeGroupIntern groupIntern) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}