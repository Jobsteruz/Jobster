package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_CANCEL_REASON")
@Entity(name = "jb_CancelReason")
@Getter
@Setter
public class CancelReason extends ParentRef implements Serializable {
    private static final long serialVersionUID = -7256260383831480066L;

    @Column(name = "REFUSED")
    private Boolean refused;

    @Column(name = "MACHINE_NAME")
    private String machineName;

    @JoinTable(name = "JB_CANCEL_REASON_ROLE_TYPE_LINK",
            joinColumns = @JoinColumn(name = "CANCEL_REASON_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<RoleType> roles;
}