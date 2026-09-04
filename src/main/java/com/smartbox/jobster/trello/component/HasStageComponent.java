package com.smartbox.jobster.trello.component;

import com.smartbox.jobster.entity.kanban.KanbanStage;

public interface HasStageComponent extends HasBuildComponent {

    KanbanStage getStage();
}
