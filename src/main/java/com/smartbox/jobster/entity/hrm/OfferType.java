package com.smartbox.jobster.entity.hrm;

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

@JmixEntity
@Table(name = "JB_OFFER_TYPE")
@Entity(name = "jb_OfferType")
@Getter
@Setter
public class OfferType extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 8374623991827463810L;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;
}
