package com.smartbox.jobster.pojo;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Jobster team
 * date: 19/08/24 18:31
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegCompanyPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = -5890735128199688905L;

    private String tenantId;
}
