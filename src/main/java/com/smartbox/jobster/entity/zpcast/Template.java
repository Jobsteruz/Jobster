package com.smartbox.jobster.entity.zpcast;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.SmartTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_TEMPLATE")
@Entity(name = "jb_Template")
@Getter
@Setter
public class Template extends SmartTenantEntity implements HasName, Serializable {

    private static final long serialVersionUID = -2416211456337214952L;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "HTML")
    private Boolean html = Boolean.FALSE;

    @Column(name = "CONVERT_CYR_TO_LAT")
    private Boolean convertCyrToLat = Boolean.FALSE;

    @Column(name = "BODY_", length = 8192)
    private String body;

    @OrderBy("sort")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "template")
    private List<TemplateField> fields;

    public String getBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}