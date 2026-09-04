package com.smartbox.jobster.entity.zpcast;

import com.smartbox.jobster.entity.core.SmartTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SALARY_DATA")
@Entity(name = "jb_SalaryData")
@Getter
@Setter
public class SalaryData extends SmartTenantEntity implements Serializable {

    private static final long serialVersionUID = -1303102473550853594L;

    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SALARY_INFO_ID")
    private SalaryInfo salaryInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    @Column(name = "DATA_")
    @Lob
    private String data;
}