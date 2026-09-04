package com.smartbox.jobster.view.trainee.mobile.intern;


import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "pending-trainee-intern-view", layout = MainView.class)
@ViewController("jb_PendingTraineeInternView")
@ViewDescriptor("pending-trainee-intern-view.xml")
public class PendingTraineeInternView extends AbstractTraineeInternView {
    public static final String VIEW_ROUTE = "pending";

    @Override
    protected String getViewRoute() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}