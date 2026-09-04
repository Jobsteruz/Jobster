package com.smartbox.jobster.view.monitoring.loader.datasupport;

import com.smartbox.jobster.entity.kanban.KanbanStage;
import io.jmix.core.FetchPlan;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author Jobster team
 * date: 22/08/24 12:28
 */

@Builder
@Getter
@Setter
public class LoadConfiguration {


    private KanbanStage stage;

    private Integer limit;

    private Integer offset;

    private String query;

    private FetchPlan fetchPlan;

    private String entityName;

    private Map<String,Object> queryParams;
}
