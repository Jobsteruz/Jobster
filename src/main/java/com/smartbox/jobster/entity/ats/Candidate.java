package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.MetadataTools;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_CANDIDATE")
@Entity(name = "jb_Candidate")
@Getter
@Setter
public class Candidate extends StandardEntity implements Serializable {
    private static final long serialVersionUID = 8242983684571436232L;

    @OrderBy("fillDate desc")
    @Composition
    @OneToMany(mappedBy = "candidate")
    private List<Applicant> applicants;

    @InstanceName
    @DependsOnProperties({"applicants"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}