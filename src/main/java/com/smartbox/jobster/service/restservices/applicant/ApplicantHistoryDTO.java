package com.smartbox.jobster.service.restservices.applicant;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.cms.Comment;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import io.jmix.core.FileRef;

import java.time.OffsetDateTime;
import java.util.List;

public record ApplicantHistoryDTO(KanbanStage kanbanStage, OffsetDateTime date, String status, User user,
                                  FileRef photo, String comment, String manager, FileRef managerPhoto,
                                  CancelReason cancelReason, OffsetDateTime managerResponseDate,
                                  String managerComment, List<Comment> stageComments) {
}
