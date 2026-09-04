package com.smartbox.jobster.service.restservices.applicant;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Label;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireEntityLabel;

import java.util.List;

public record ApplicantInfoResDTO(KanbanStage stage, List<QuestionnaireEntityLabel> labels, Applicant applicant) {
}
