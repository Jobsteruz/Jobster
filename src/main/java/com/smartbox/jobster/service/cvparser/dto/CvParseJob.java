package com.smartbox.jobster.service.cvparser.dto;

import com.smartbox.jobster.view.survey.sendsurvey.PersonType;
import io.jmix.core.FileRef;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class CvParseJob implements Serializable {

    // Bumped when autoApplyMode was added for the bot/questionnaire headless flow.
    @Serial
    private static final long serialVersionUID = 6472983010024586202L;

    private String jobId;
    /**
     * Target person id. Named {@code applicantId} for historical reasons — with the V2 Employee
     * pipeline, this field holds an {@link com.smartbox.jobster.entity.hrm.Employee} id when
     * {@link #personType} is {@link PersonType#EMPLOYEE}. Consumers should dispatch on
     * {@code personType} to load the correct entity.
     */
    private UUID applicantId;
    private String tenantId;
    private String principalName;
    private String filename;
    /**
     * Original CV bytes persisted to {@code FileStorage} on upload, before the file is sent to
     * the external parser. Captured here so the apply path can attach it as a {@code RESUME}
     * {@code PersonDocument} on the target person without re-uploading. {@code null} when the
     * persistence step failed (the parse + apply still proceed — the document attachment is
     * best-effort, see CvParserUploader / CvBatchChildUploader).
     */
    private FileRef cvFile;
    private CvParseJobStatus status = CvParseJobStatus.QUEUED;
    private String externalJobId;
    private ResumeParserResponse parsedData;
    private String error;
    private Instant createdAt = Instant.now();

    /**
     * Optional — when non-null, this job belongs to a batch import and its terminal events are
     * forwarded to {@code CvBatchAggregator}. {@code null} for the single-person V2 flow.
     */
    private String batchId;

    /**
     * Which kind of {@link com.smartbox.jobster.entity.core.Person} this job targets. Defaults
     * to {@link PersonType#APPLICANT} so pre-existing jobs (serialized before this field
     * existed) deserialize to the historical Applicant path.
     */
    private PersonType personType = PersonType.APPLICANT;

    /**
     * Whether the webhook handler should auto-apply parsed fields to the target person. Defaults
     * to {@link CvParseAutoApplyMode#NONE} so all existing dialog-driven jobs keep their
     * review-then-apply semantics. The Telegram questionnaire bot sets this to
     * {@link CvParseAutoApplyMode#EMPTY_ONLY} because there is no UI to let the user choose
     * fields — the webhook fills only the Applicant fields the candidate left empty.
     */
    private CvParseAutoApplyMode autoApplyMode = CvParseAutoApplyMode.NONE;
}
