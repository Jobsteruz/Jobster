package com.smartbox.jobster.entity.tg;


import java.io.Serializable;

/**
 * @author Jobster team
 * Since: 11/26/2024 9:15 PM
 */
public record TgFile(String fileId,
                     String fileUniqueId,
                     Long fileSize,
                     String fileName,
                     String fileCaption,
                     FileType fileType) implements Serializable {
    private static final long serialVersionUID = -1731927882366702156L;
}
