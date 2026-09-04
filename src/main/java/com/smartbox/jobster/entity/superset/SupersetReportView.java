package com.smartbox.jobster.entity.superset;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.service.SequenceService;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_SUPERSET_REPORT_VIEW", indexes = {
        @Index(name = "IDX_JB_SUPERSET_REPORT_VIEW_GROUP", columnList = "GROUP_ID")
})
@Entity(name = "jb_SupersetReportView")
@Getter
@Setter
public class SupersetReportView extends ParentRef implements Serializable {

    private static final long serialVersionUID = 8612904725631890115L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SupersetReportGroup group;

    /**
     * Superset embedded dashboard id (UUID string from Superset). Used by
     * {@code SupersetTokenService.getGuestTokenForDashboard()} and embedded SDK on the client.
     */
    @Column(name = "DASHBOARD_ID")
    private String dashboardId;

    @Column(name = "FAVORITE")
    private Boolean favorite;

    @JoinTable(name = "JB_SUPERSET_REPORT_VIEW_ROLE_TYPE_LINK",
            joinColumns = @JoinColumn(name = "SUPERSET_REPORT_VIEW_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<RoleType> roleTypes;

    /** Stable short id for URL routing (mirrors {@code ReportView.crcId}). */
    @Column(name = "CRC_ID")
    private String crcId;

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
