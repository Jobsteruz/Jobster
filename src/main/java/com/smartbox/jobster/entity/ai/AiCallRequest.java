package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@JmixEntity
@Table(name = "JB_AI_CALL_REQUEST")
@Entity(name = "jb_AiCallRequest")
public class AiCallRequest extends StandardTenantEntity implements Serializable {

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(name = "COMPANY_NUMBER", nullable = false)
    private String companyNumber;

    @NotNull
    @Column(name = "USER_ID", nullable = false)
    private String userId;

    @Column(name = "PERSON_NAME")
    private String personName;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "WELCOME_TEXT", length = 1000)
    private String welcomeText;

    @Column(name = "GOODBYE_TEXT", length = 1000)
    private String goodbyeText;

    @Column(name = "TRY_COUNT")
    private Integer tryCount;

    @Lob
    @Column(name = "REQUEST_JSON")
    private String requestJson;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    private String status; // SUCCESS, FAILED, PENDING

    @Column(name = "REQUEST_DATE")
    private LocalDateTime requestDate;

    @Column(name = "LAST_RETRY_DATE")
    private LocalDateTime lastRetryDate;

    @Column(name = "RETRY_COUNT")
    private Integer retryCount;

    @Column(name = "ERROR_MESSAGE", length = 2000)
    private String errorMessage;

    @Column(name = "RESPONSE_DATA", length = 5000)
    private String responseData;

    public UUID getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setId(UUID id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}