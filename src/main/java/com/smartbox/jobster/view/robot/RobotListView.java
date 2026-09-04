package com.smartbox.jobster.view.robot;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.entity.robot.RobotAction;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.entity.robot.RobotKanbanStage;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.SequenceService;
import com.smartbox.jobster.service.robot.RobotService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.router.Route;
import io.jmix.core.MetadataTools;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.core.UuidProvider;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;

@Route(value = "robots", layout = MainView.class)
@ViewController("jb_Robot.list")
@ViewDescriptor("robot-list-view.xml")
@DialogMode(width = "64em")
public class RobotListView extends AbstractListView<Robot> {


    @Autowired
    private RobotService robotService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private MetadataTools metadataTools;

    @ViewComponent
    private H4 warning;
    @Autowired
    private SequenceService sequenceService;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.clone")
    public void onEntityDataGridClone(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clone(Robot robot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}