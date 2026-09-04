package com.smartbox.jobster.pojo;

import io.jmix.core.FileRef;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Jobster team
 * Since: 12/27/2023 11:32 AM
 */
@Getter
@Setter
public class MailPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1027075783032138670L;

    private String from;

    private String replyTo;

    private String to;

    private String[] cc;

    private String[] bcc;

    private Date sentDate;

    private String subject;

    private String text;

    private String tenantId;

    private List<FileRef> files;
}
