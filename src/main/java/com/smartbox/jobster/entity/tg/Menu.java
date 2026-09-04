package com.smartbox.jobster.entity.tg;

import com.smartbox.jobster.entity.core.HierarchicalEntity;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.ParentRef;
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
@Table(name = "JB_MENU", indexes = {
        @Index(name = "IDX_JB_MENU_BOT", columnList = "BOT_ID"),
        @Index(name = "IDX_JB_MENU_PARENT", columnList = "PARENT_ID"),
        @Index(name = "IDX_JB_MENU_QUESTIONNAIRE", columnList = "QUESTIONNAIRE_ID")
})
@Entity(name = "jb_Menu")
@Getter
@Setter
public class Menu extends ParentRef implements HierarchicalEntity, Serializable {

    private static final long serialVersionUID = 6225339443337888590L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOT_ID")
    private Bot bot;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Menu parent;

    @OrderBy("sort, code, createdDate")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "parent")
    private List<Menu> children;

    @OrderBy("sort, createdDate")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "menu")
    private List<Post> posts;

    @Column(name = "POST_TYPE")
    private String postType = PostType.POST.getId();

    @Column(name = "LOGIN_TYPE")
    private String loginType;

    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    @Column(name = "CHECK_UP")
    private Boolean checkUp;

    @Column(name = "NEXT_LINE")
    private Boolean nextLine;

    @Column(name = "HOT")
    private Boolean hot;

    @Column(name = "HIDE")
    private Boolean hide;

    @Column(name = "WEB_APP_URL")
    private String webAppUrl;

    @Column(name = "WEB_APP")
    private Boolean webApp;

    @Column(name = "SHARE_TEXT")
    @Lob
    private String shareText;

    @JmixGeneratedValue
    @Column(name = "HIERARCHICAL_ID")
    private Long hierarchicalId;

    @Column(name = "HIERARCHICAL_KEY", length = 1024)
    private String hierarchicalKey;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "menu")
    private List<MenuRole> roles;

    public PostType getPostType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPostType(PostType postType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LoginType getLoginType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLoginType(LoginType loginType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getWebApp() {
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