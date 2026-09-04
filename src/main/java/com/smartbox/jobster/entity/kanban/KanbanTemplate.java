package com.smartbox.jobster.entity.kanban;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_KANBAN_TEMPLATE")
@Entity(name = "jb_KanbanTemplate")
@Getter
@Setter
public class KanbanTemplate extends ParentRef implements Serializable {
    private static final long serialVersionUID = -5036586641312539869L;

    @Column(name = "ENTITY_NAME")
    private String entityName;
}