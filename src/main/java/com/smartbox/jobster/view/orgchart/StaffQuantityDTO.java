package com.smartbox.jobster.view.orgchart;

import java.io.Serializable;

public record StaffQuantityDTO(int total, int empQty, int staffQty) implements Serializable {
    private static final long serialVersionUID = -5719153420027939280L;
}
