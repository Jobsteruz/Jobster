package com.smartbox.jobster.entity.zpcast;

import com.google.gson.annotations.Expose;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.SmartTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TEMPLATE_FIELD")
@Entity(name = "jb_TemplateField")
@Getter
@Setter
public class TemplateField extends SmartTenantEntity implements HasName, HasSort, Serializable {

    private static final long serialVersionUID = -8332529788942517653L;

    @InstanceName
    @Column(name = "NAME", length = 512)
    private String name;

    @Column(name = "REPLACE_")
    private String replace;

    @Column(name = "SHOW")
    private Boolean show = Boolean.FALSE;

    @Column(name = "PREFIX")
    private String prefix;

    @Column(name = "CAPTION_HIDE")
    private Boolean showCaption = Boolean.FALSE;

    @Column(name = "SUFFIX")
    protected String suffix;

    @Column(name = "BOLD_LEFT")
    private Boolean boldLeft = Boolean.FALSE;

    @Column(name = "BOLD")
    private Boolean boldRight = Boolean.FALSE;

    @Column(name = "ITALIC")
    private Boolean italicRight = Boolean.FALSE;

    @Column(name = "ITALIC_LEFT")
    private Boolean italicLeft = Boolean.FALSE;

    @Column(name = "PATTERN")
    private String pattern;

    @Column(name = "SORT")
    protected Integer sort;

    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEMPLATE_ID")
    @Expose
    private Template template;
}