package com.smartbox.jobster.pojo;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 20/04/24 13:55
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RobotPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1027291083032138699L;

    private UUID robotId;
    private String authenticationLogin;
}