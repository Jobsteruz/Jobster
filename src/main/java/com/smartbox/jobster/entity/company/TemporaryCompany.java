package com.smartbox.jobster.entity.company;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TEMPORARY_COMPANY")
@Entity(name = "jb_TemporaryCompany")
@Getter
@Setter
public class TemporaryCompany extends StandardEntity implements Serializable {
    private static final long serialVersionUID = 1655759795027098711L;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "EMAIL")
    private String email;

    @Secret
    @JsonIgnore
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "VERIFIED")
    private Boolean verified;

}
