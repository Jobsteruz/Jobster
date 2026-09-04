package com.smartbox.jobster.service.outlook.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Response of {@code GET /me/messages/{id}/attachments}. Only {@code fileAttachment} entries carry
 * inline {@code contentBytes} (base64); {@code itemAttachment}/{@code referenceAttachment} do not,
 * so callers must gate on {@link GraphAttachment#isFileAttachment()}.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record GraphAttachmentCollection(List<GraphAttachment> value) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record GraphAttachment(
            @JsonProperty("@odata.type") String odataType,
            String name,
            String contentType,
            Integer size,
            Boolean isInline,
            String contentBytes
    ) {
        public boolean isFileAttachment() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}
