package com.smartbox.jobster.entity.core;

import java.io.Serializable;

/**
 * @author Jobster team
 * Date: 04/07/2023 16:07
 */
public interface JbTenantEntity<E extends Serializable> extends JbEntity<E> {

    String getTenantId();

    void setTenantId(String tenantId);

}
