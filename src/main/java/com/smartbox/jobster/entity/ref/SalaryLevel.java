package com.smartbox.jobster.entity.ref;

import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@JmixEntity
@Table(name = "JB_SALARY_LEVEL")
@Entity(name = "jb_SalaryLevel")
@Getter
@Setter
public class SalaryLevel extends ParentRef implements Serializable {

    private static final long serialVersionUID = -9000558408035214719L;

    @NumberFormat(pattern = "###,###,###,##0.00")
    @Column(name = "FROM_", precision = 19, scale = 2)
    private BigDecimal from;

    @NumberFormat(pattern = "###,###,###,##0.00")
    @Column(name = "TO_", precision = 19, scale = 2)
    private BigDecimal to;
}