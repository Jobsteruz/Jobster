package com.smartbox.jobster.entity.whatsapp;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.FileRef;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_WHATSAPP_BOT")
@Entity(name = "jb_WhatsappBot")
@Getter
@Setter
public class WhatsappBot extends ParentRef implements Serializable {


    private static final long serialVersionUID = 378890956988547196L;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "PHONE_NUMBER_ID")
    private String phoneNumberId;

    @Secret
    @Column(name = "API_KEY")
    private String apiKey;

    @Column(name = "BUSINESS_ACCOUNT_ID")
    private String businessAccountId;

    @Secret
    @Column(name = "WEBHOOK_VERIFY_TOKEN")
    private String webhookVerifyToken;

    @Secret
    @Column(name = "CLIENT_SECRET")
    private String clientSecret;

    @Column(name = "ACTIVE")
    private Boolean active = Boolean.TRUE;

    @Column(name = "START_TEXT")
    private String startText;

    @Column(name = "START_IMAGE")
    private FileRef startImage;
}