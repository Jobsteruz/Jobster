package com.smartbox.jobster.entity.cms;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_COMMENT", indexes = {
        @Index(name = "IDX_JB_COMMENT_ENTITY", columnList = "ENTITY_NAME, ENTITY_ID"),
        @Index(name = "IDX_JB_COMMENT_PARENT", columnList = "PARENT_ID"),
        @Index(name = "IDX_JB_COMMENT_USER", columnList = "USER_ID")
})
@Entity(name = "jb_Comment")
@Getter
@Setter
public class Comment extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -6842962830928941595L;

    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Comment parent;

    @InstanceName
    @Column(name = "TITLE")
    private String title;

    @Column(name = "BODY_")
    @Lob
    private String body;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
