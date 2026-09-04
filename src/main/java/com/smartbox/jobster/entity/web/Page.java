package com.smartbox.jobster.entity.web;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_PAGE", indexes = {
        @Index(name = "IDX_JB_PAGE_WEBSITE", columnList = "WEBSITE_ID")
})
@Entity(name = "jb_Page")
@Getter
@Setter
public class Page extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 8535586106353089195L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "WEBSITE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Website website;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "URI")
    private String uri;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "GAP")
    private String gap;

    @Column(name = "START_HEAD")
    @Lob
    private String startHead;

    @Column(name = "END_HEAD")
    @Lob
    private String endHead;

    @Column(name = "START_BODY")
    @Lob
    private String startBody;

    @Column(name = "END_BODY")
    private String endBody;

    @Column(name = "STYLE")
    @Lob
    private String style;

    @Column(name = "SCRIPT")
    @Lob
    private String script;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "page")
    private List<Section> sections;
}