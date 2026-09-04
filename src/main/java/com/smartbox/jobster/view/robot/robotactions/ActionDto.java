package com.smartbox.jobster.view.robot.robotactions;

import com.smartbox.jobster.action.JbKanbanAction;
import com.smartbox.jobster.entity.robot.RobotAction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Jobster team
 * date: 21/06/24 14:51
 */
@AllArgsConstructor
@Getter
@Setter
class ActionDto {

    private RobotAction action;
    private ActionState state;

    public JbKanbanAction makeActionFromRobot() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    enum ActionState {

        // added then removed, but not saved to db



        OLD,
        NEW,
        REMOVED,
        REMOVED_LOCAL
    }
}