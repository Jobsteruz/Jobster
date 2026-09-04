package com.smartbox.jobster.entity.kanban;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.integration.hh.HHStage;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_KANBAN_STAGE", indexes = {
        @Index(name = "IDX_JB_KANBAN_STAGE_KANBAN", columnList = "KANBAN_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_REJECT_TEMPLATE", columnList = "REJECT_TEMPLATE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_RESERVE_TEMPLATE", columnList = "RESERVE_TEMPLATE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_ADMIT_TEMPLATE", columnList = "ADMIT_TEMPLATE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HIRE_ROLE_TYPE", columnList = "HIRE_ROLE_TYPE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_CONVERT_ROLE_TYPE", columnList = "CONVERT_ROLE_TYPE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_BLACKLIST_TEMPLATE", columnList = "BLACKLIST_TEMPLATE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HIRE_TEMPLATE", columnList = "HIRE_TEMPLATE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_EXIT_INT_TEMPLATE", columnList = "EXIT_INTERVIEW_TEMPLATE_ID")
})
@Entity(name = "jb_KanbanStage")
@Getter
@Setter
public class KanbanStage extends ParentRef implements Serializable {
    private static final long serialVersionUID = -1644136316460047529L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "KANBAN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "WIDTH")
    private String width;

    @Column(name = "DEFAULT_STATUS")
    private String defaultStatus;

    @Column(name = "DEADLINE")
    private Integer deadline;

    @Column(name = "HIDE")
    private Boolean hide;

    @Column(name = "ENABLE_EVENT")
    private Boolean enableEvent;

    @Column(name = "ENABLE_QUIZ")
    private Boolean enableQuiz;

    @Column(name = "ENABLE_AUTO_NEXT_STAGE")
    private Boolean enableAutoNextStage;

    @Column(name = "ENABLE_BLACKLIST")
    private Boolean enableBlacklist;

    @JoinColumn(name = "BLACKLIST_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate blacklistTemplate;

    @Column(name = "ENABLE_REJECT")
    private Boolean enableReject;

    @JoinColumn(name = "REJECT_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate rejectTemplate;

    @Column(name = "ENABLE_RESERVE")
    private Boolean enableReserve;

    @JoinColumn(name = "RESERVE_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate reserveTemplate;

    @Column(name = "ENABLE_ADMIT")
    private Boolean enableAdmit;

    @JoinColumn(name = "ADMIT_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate admitTemplate;

    @JoinColumn(name = "HIRE_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate hireTemplate;

    @Column(name = "ENABLE_HIRE")
    private Boolean enableHire;

    @JoinColumn(name = "HIRE_ROLE_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleType hireRoleType;

    /**
     * When set, the hire dialog of this stage asks for the day the candidate is expected at work
     * and stores it on the created employee as {@code Employee.dateStartWork}.
     */
    @Column(name = "ENABLE_START_WORK_DATE")
    private Boolean enableStartWorkDate;

    @Column(name = "ENABLE_CONVERT")
    private Boolean enableConvert;

    @JoinColumn(name = "CONVERT_ROLE_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleType convertRoleType;

    @Column(name = "ENABLE_EXIT_INTERVIEW")
    private Boolean enableExitInterview;

    @JoinColumn(name = "EXIT_INTERVIEW_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate exitInterviewTemplate;

    @Column(name = "HH_STAGE")
    private String hhStage;

    public String getWidth() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getDeadline() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public PersonStatus getDefaultStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDefaultStatus(PersonStatus defaultStatus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public HHStage getHhStage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setHhStage(HHStage hhStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}