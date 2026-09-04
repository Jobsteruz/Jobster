package com.smartbox.jobster.entity.kanban;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_KANBAN", indexes = {
        @Index(name = "IDX_JB_KANBAN_TEMPLATE", columnList = "TEMPLATE_ID")
})
@Entity(name = "jb_Kanban")
@Getter
@Setter
public class Kanban extends ParentRef implements Serializable {
    private static final long serialVersionUID = -6392326534339458518L;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "DETAIL_VIEW_ID")
    private String detailViewId;

    @Column(name = "LIST_VIEW_ID")
    private String listViewId;

    @Column(name = "LIST_NAV_ID")
    private String listNavId;

    @Column(name = "CARD_VIEW_ID")
    private String cardViewId;

    @Column(name = "QUERY")
    private String query;

    @JoinColumn(name = "TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanTemplate template;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "kanban")
    private List<KanbanStage> stages;
}