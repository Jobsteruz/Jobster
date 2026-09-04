package com.smartbox.jobster.view.trainee.groupintern;

import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "traineeGroupInterns", layout = MainView.class)
@ViewController(id = "jb_TraineeGroupIntern.list")
@ViewDescriptor(path = "trainee-group-intern-list-view.xml")
public class TraineeGroupInternListView extends AbstractListView<TraineeGroupIntern> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}