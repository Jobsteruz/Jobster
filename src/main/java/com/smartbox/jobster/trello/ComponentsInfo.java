package com.smartbox.jobster.trello;

import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.vaadin.flow.component.Component;

import java.util.Collection;

/**
 * @author Jobster team
 * date: 14/09/24 03:22
 */
public record ComponentsInfo<T extends Component>(Collection<T> components,
                                                  KanbanStage srcStage,
                                                  int startIndex) {
}
