package com.smartbox.jobster.entity.report;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.service.SequenceService;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_REPORT_VIEW", indexes = {
        @Index(name = "IDX_JB_REPORT_VIEW_GROUP", columnList = "GROUP_ID"),
        @Index(name = "IDX_JB_REPORT_VIEW_KANBAN", columnList = "KANBAN_ID")
})
@Entity(name = "jb_ReportView")
@Getter
@Setter
public class ReportView extends ParentRef implements Serializable {

    private static final long serialVersionUID = 7536490611616771075L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ReportGroup group;

    @Column(name = "VIEW_ID")
    private String viewId;

    @Column(name = "FAVORITE")
    private Boolean favorite;

    @Column(name = "QUERY")
    @Lob
    private String query;

    @JoinColumn(name = "KANBAN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;

    @Column(name = "ALL_STAGES")
    private Boolean allStages;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "report")
    private List<ReportKanbanStage> kanbanStages;

    @JoinTable(name = "JB_REPORT_VIEW_ROLE_TYPE_LINK",
            joinColumns = @JoinColumn(name = "REPORT_VIEW_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<RoleType> roleTypes;

    @Column(name = "CRC_ID")
    private String crcId;

    @Column(name = "DASHBOARD")
    protected Boolean dashboard;

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}