package com.smartbox.jobster.entity.web;

import com.smartbox.jobster.entity.ref.ParentRef;
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
@Table(name = "JB_SECTION", indexes = {
        @Index(name = "IDX_JB_SECTION_PAGE", columnList = "PAGE_ID")
})
@Entity(name = "jb_Section")
@Getter
@Setter
public class Section extends ParentRef implements Serializable {

    private static final long serialVersionUID = 1738090509968235049L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Page page;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "section")
    private List<SectionFile> files;
}