package com.smartbox.jobster.pojo.ai.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jobster team
 * date: 22/05/24 13:39
 */
@Getter
@Setter
@ToString
public class SpeechAssessmentRequest extends AbstractAIServiceRequest<SpeechAssessmentRequest> {

    private static final long serialVersionUID = 6769716655415309132L;

    private String criteria;
    private String language;
    private String fileUrl;
    private String callbackUrl;
}