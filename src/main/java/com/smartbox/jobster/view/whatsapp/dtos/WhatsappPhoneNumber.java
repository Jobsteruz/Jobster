package com.smartbox.jobster.view.whatsapp.dtos;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

@JmixEntity(name = "jb_WhatsappPhoneNumber")
@Getter
@Setter
public class WhatsappPhoneNumber {
    //     "verified_name": "<business-name>",
    //            "code_verification_status": "VERIFIED",
    //            "display_phone_number": "<phone>",
    //            "quality_rating": "GREEN",
    //            "platform_type": "CLOUD_API",
    //            "throughput": {
    //                "level": "STANDARD"
    //            },
    //            "webhook_configuration": {
    //                "application": "https://<your-tunnel>.ngrok-free.app/open/whatsapp-handler"
    //            },
    //            "id": "<phone-number-id>"

    private String id;
    private String verifiedName;
    private String nameVerificationStatus;
    private String codeVerificationStatus;
    private String displayPhoneNumber;
    private String qualityRating;
    private String platformType;
    private WhatsappPhoneNumberThroughput throughput;
    private WhatsappPhoneNumberWebhookConfiguration webhookConfiguration;

}
