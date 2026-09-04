package com.smartbox.jobster.entity.web;

import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_WEBSITE", indexes = {
        @Index(name = "IDX_JB_WEBSITE_COMPANY", columnList = "COMPANY_ID"),
        @Index(name = "IDX_JB_WEBSITE_DEFAULT_PAGE", columnList = "DEFAULT_PAGE_ID")
})
@Entity(name = "jb_Website")
@Getter
@Setter
public class Website extends ParentRef implements Serializable {

    private static final long serialVersionUID = -914629922305351758L;

    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @Column(name = "HOST")
    private String host;

    @Column(name = "DOMAIN_")
    private String domain;

    @Column(name = "FAVICON", length = 1024)
    private FileRef favicon;

    @JoinColumn(name = "DEFAULT_PAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Page defaultPage;

    @Column(name = "DEFAULT_LOCALE")
    private String defaultLocale = "uz";

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "website")
    private List<Page> pages;
}