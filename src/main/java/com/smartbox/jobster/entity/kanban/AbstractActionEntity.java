package com.smartbox.jobster.entity.kanban;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

@JmixEntity(name = "jb_AbstractActionEntity")
@MappedSuperclass
@Getter
@Setter
public abstract class AbstractActionEntity extends StandardTenantEntity implements HasSort, Serializable {
    private static final long serialVersionUID = 7101535357772968318L;

    @Column(name = "CLASS_NAME")
    private String className;

    @Column(name = "METHOD_PARAMS")
    @Lob
    private String methodParams;

    @Column(name = "SORT")
    private Integer sort;

    public Map<String, String> getMethodParams() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setMethodParams(Map<String, String> methodParams) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}