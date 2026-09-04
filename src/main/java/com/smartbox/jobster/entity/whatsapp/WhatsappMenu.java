package com.smartbox.jobster.entity.whatsapp;

import com.smartbox.jobster.entity.core.HierarchicalEntity;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.tg.*;
import io.jmix.core.DeletePolicy;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
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
@Table(name = "JB_WHATSAPP_MENU")
@Entity(name = "jb_WhatsappMenu")
@Getter
@Setter
public class WhatsappMenu extends ParentRef implements HierarchicalEntity, Serializable {

    private static final long serialVersionUID = -1522889368776443518L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOT_ID")
    private WhatsappBot bot;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private WhatsappMenu parent;

    @OrderBy("sort, code, createdDate")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "parent")
    private List<WhatsappMenu> children;

    @OrderBy("sort, createdDate")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "menu")
    private List<WhatsappPost> posts;

    @Column(name = "POST_TYPE")
    private String postType = PostType.POST.getId();

    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    @Column(name = "HIDE")
    private Boolean hide;

    @JmixGeneratedValue
    @Column(name = "HIERARCHICAL_ID")
    private Long hierarchicalId;

    @Column(name = "HIERARCHICAL_KEY", length = 1024)
    private String hierarchicalKey;



    public PostType getPostType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPostType(PostType postType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"name", "hierarchicalKey"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void preUpdate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}