package com.smartbox.jobster.pojo;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 1/25/2025 2:36 PM
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HHPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = -8741621084390841924L;

    private UUID userId;
    private String userName;
}
