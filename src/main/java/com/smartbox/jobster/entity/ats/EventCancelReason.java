package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_EVENT_CANCEL_REASON")
@Entity(name = "jb_EventCancelReason")
@Getter
@Setter
public class EventCancelReason extends ParentRef implements Serializable {
    private static final long serialVersionUID = 1291077797275769430L;
}
