package com.smartbox.jobster.pojo;

import lombok.Data;

import java.util.Collection;

@Data
public abstract class AbstractHierarchicOption {

    private String name;
    private Object value;
    private boolean disabled = false;
    private Collection<AbstractHierarchicOption> children;
}
