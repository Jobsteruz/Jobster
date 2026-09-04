package com.smartbox.jobster.pojo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 7/20/2023 10:25 AM
 */
@Getter
@Setter
@RequiredArgsConstructor
public class SmsPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = -191395554312662720L;

    private UUID smsId;

    private String from;

    private final String to;

    private final String text;

    private String countryCode;

    private String callbackUrl;

    private String skipGateway;

    private final String tenantId;
}
