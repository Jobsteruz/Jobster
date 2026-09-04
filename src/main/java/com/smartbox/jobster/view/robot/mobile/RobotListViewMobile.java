package com.smartbox.jobster.view.robot.mobile;

import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.view.abstractview.AbstractMobileListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.robot.mobile.robotmobilecardfragment.RobotMobileCardFragment;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "robotsMobile", layout = MainView.class)
@ViewController("jb_RobotMobile.list")
@ViewDescriptor("robot-list-view-mobile.xml")
public class RobotListViewMobile extends AbstractMobileListView<Robot> {
    @Autowired
    private Fragments fragments;

    @ViewComponent
    private VerticalLayout layout;


    /**
     * Cards are built here instead of after {@code super.onTimerTimerAction}: the list load runs on
     * a worker now, so the container is still empty when the timer action returns. {@code layout}
     * holds nothing but these cards (see robot-list-view-mobile.xml), so clearing it first keeps a
     * re-apply from stacking a second set on top of the first.
     */
    @Override
    protected void afterListLoad() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onCreateBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}