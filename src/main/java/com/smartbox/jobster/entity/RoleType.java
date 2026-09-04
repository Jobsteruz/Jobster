package com.smartbox.jobster.entity;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_ROLE_TYPE")
@Entity(name = "jb_RoleType")
@Getter
@Setter
public class RoleType extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = -2139320558812652525L;

    @Column(name = "MACHINE_NAME")
    private String machineName;

    @Column(name = "RESOURCE_ROLE_CODES")
    @Lob
    private String resourceRoleCodes;

    public List<String> getResourceRoleCodes() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setResourceRoleCodes(List<String> resourceRoleCodes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}