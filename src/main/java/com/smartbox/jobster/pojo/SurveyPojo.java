package com.smartbox.jobster.pojo;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SurveyPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = 4654191320024454475L;

    private UUID surveyId;
    private UUID tgUserId;
}