package com.smartbox.jobster.entity.report;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
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
@Table(name = "JB_REPORT_GROUP")
@Entity(name = "jb_ReportGroup")
@Getter
@Setter
public class ReportGroup extends ParentRef implements Serializable {

    private static final long serialVersionUID = 6868342501446180214L;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "group")
    @OrderBy("sort")
    private List<ReportView> reports;
}