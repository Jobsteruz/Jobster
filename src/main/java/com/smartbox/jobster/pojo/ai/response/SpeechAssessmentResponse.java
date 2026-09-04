
package com.smartbox.jobster.pojo.ai.response;

import lombok.*;

/**
 * @author Jobster team
 * date: 21/05/2024 18:30
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class SpeechAssessmentResponse extends AbstractAIServiceResponse<SpeechAssessmentResponse> {

    public static final Double MAX_SCORE = 10.0;

    private static final long serialVersionUID = 5314887038691894456L;

    private Double score;
    private String transcript;
    private String explanation;
    private SpeechAssessmentMetadata metadata;
}
