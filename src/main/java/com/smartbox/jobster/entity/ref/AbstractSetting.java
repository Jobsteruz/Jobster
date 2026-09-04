package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity(name = "jb_AbstractSetting")
@MappedSuperclass
@Getter
@Setter
public abstract class AbstractSetting extends StandardTenantEntity implements Serializable {

    public static final String VALUE = "value";
    private static final long serialVersionUID = 6212479394729698386L;

    @Column(name = "TYPE_")
    private String type;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    @InstanceName
    @Column(name = "VALUE_")
    @Lob
    private String value;

    public SettingType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(SettingType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}