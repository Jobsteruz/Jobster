
package com.smartbox.jobster.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentHierarchicOption extends AbstractHierarchicOption {

    private Object regionId;
}
