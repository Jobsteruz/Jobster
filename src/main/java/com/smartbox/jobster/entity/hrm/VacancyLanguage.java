package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.LanguageLevel;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_VACANCY_LANGUAGE", indexes = {
        @Index(name = "IDX_JB_VACANCY_LANGUAGE_VACANCY", columnList = "VACANCY_ID"),
        @Index(name = "IDX_JB_VACANCY_LANGUAGE_LANGUAGE", columnList = "LANGUAGE_ID")
})
@Entity(name = "jb_VacancyLanguage")
@Getter
@Setter
public class VacancyLanguage extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -4375572964013728776L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "VACANCY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacancy vacancy;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "LANGUAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Language language;

    @Column(name = "LEVEL_")
    private String level;

    public LanguageLevel getLevel() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLevel(LanguageLevel level) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}