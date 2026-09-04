package com.smartbox.jobster.pojo.ai.response;

import com.smartbox.jobster.pojo.ai.AbstractAIService;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * @author Jobster team
 * date: 21/05/2024 18:30
 */
@Getter
@Setter
public abstract class AbstractAIServiceResponse<T extends Serializable> extends AbstractAIService<T> {
}
