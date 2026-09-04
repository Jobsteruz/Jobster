package com.smartbox.jobster.pojo.ai.request;

import com.smartbox.jobster.pojo.ai.AbstractAIService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Jobster team
 * date: 22/05/24 12:34
 */

@Getter
@Setter
@ToString
public abstract class AbstractAIServiceRequest<T extends Serializable> extends AbstractAIService<T> {

    protected String entityId;
    protected String entityName;
}
