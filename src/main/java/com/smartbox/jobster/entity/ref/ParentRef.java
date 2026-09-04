package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.SmartTenantEntity;
import com.smartbox.jobster.service.SequenceService;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity(name = "jb_ParentRef")
@MappedSuperclass
@Getter
@Setter
public abstract class ParentRef extends SmartTenantEntity implements HasName, HasName.HasShortName, HasSort, Serializable {
    @Serial
    private static final long serialVersionUID = -4551532583762570202L;

    @Column(name = "INNER_ID")
    protected String innerId;

    @InstanceName
    @Column(name = "NAME", length = 512)
    protected String name;

    @Size(max = 255)
    @Column(name = "SHORT_NAME")
    protected String shortName;

    @Column(name = "ACTIVE")
    protected Boolean active = Boolean.TRUE;

    @Column(name = "SORT")
    protected Integer sort;

    public String getShortName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void postConstruct() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
