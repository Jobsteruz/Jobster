package com.smartbox.jobster.pojo;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = -8827364519283746501L;

    private String id;
    private String username;
    private String tenantId;
    private String exceptionClass;
    private String message;
    private String date;
    private String ipAddress;
    /** "UI" or "BACKEND" — see {@code TicketSource}. */
    private String source;
}
