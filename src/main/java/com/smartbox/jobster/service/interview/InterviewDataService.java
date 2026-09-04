package com.smartbox.jobster.service.interview;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Setter
@Service
@SessionScope
public class InterviewDataService {
    private Applicant applicant;
    private TempQuestionnaire questionnaire;
}