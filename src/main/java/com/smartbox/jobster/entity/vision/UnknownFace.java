package com.smartbox.jobster.entity.vision;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_UNKNOWN_FACE")
@Entity(name = "jb_UnknownFace")
@Getter
@Setter
public class UnknownFace extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 8463599488576245995L;

    @Column(name = "TIME_")
    private OffsetDateTime time;

    @Column(name = "PHOTO", length = 1024)
    private FileRef photo;
}