package com.smartbox.jobster.entity.ui;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.service.SequenceService;
import io.jmix.core.DeletePolicy;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_NAVIGATION", indexes = {
        @Index(name = "IDX_JB_NAVIGATION_KANBAN", columnList = "KANBAN_ID"),
        @Index(name = "IDX_JB_NAVIGATION_PARENT", columnList = "PARENT_ID"),
        @Index(name = "IDX_JB_NAVIGATION_QUESTIONNAIRE", columnList = "QUESTIONNAIRE_ID")
})
@Entity(name = "jb_Navigation")
@Getter
@Setter
public class Navigation extends ParentRef implements Serializable {

    private static final long serialVersionUID = -1979784021757000007L;

    @Column(name = "VIEW_ID")
    private String viewId;

    @Column(name = "QUERY")
    @Lob
    private String query;

    @Column(name = "BADGE")
    @Lob
    private String badge;

    @Column(name = "CRC_ID")
    private String crcId;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "OPENED")
    private Boolean opened;

    @JoinColumn(name = "KANBAN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;

    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Navigation parent;

    @OneToMany(mappedBy = "parent")
    @Composition
    @OrderBy("sort, createdDate")
    @OnDelete(DeletePolicy.CASCADE)
    private List<Navigation> children;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "navigation")
    private List<NavigationRole> roles;

    public Boolean getOpened() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"name"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}