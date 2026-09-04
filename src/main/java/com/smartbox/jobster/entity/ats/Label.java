package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_LABEL")
@Entity(name = "jb_Label")
@Getter
@Setter
public class Label extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 1971662608697528285L;

    @InstanceName
    @Column(name = "TITLE")
    private String title;

    @Column(name = "COLOR")
    private String color;

    public QuestionnaireColor getColor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setColor(QuestionnaireColor color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}