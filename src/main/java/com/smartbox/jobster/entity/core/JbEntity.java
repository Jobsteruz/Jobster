package com.smartbox.jobster.entity.core;

import java.io.Serializable;

/**
 * @author Jobster team
 * Date: 04/07/2023 16:05
 */
public interface JbEntity<E extends Serializable> {
    E getId();

    void setId(E id);
}
