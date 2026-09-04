package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "PARTNER_INTEGRATION_SETTINGS")
@Entity
@Getter
@Setter
public class PartnerIntegrationSettings extends AppSettingsEntity implements Serializable {

    @Secret
    @Column(name = "TICKET_API_URL")
    private String ticketApiUrl;

    @Secret
    @Column(name = "TICKET_API_TOKEN")
    private String ticketApiToken;

    @AppSettingsDefault("Onboarding сотрудника")
    @Column(name = "TICKET_TITLE")
    private String ticketTitle;

    @Secret
    @Column(name = "TICKET_SUBSCRIPTION_ID")
    private String ticketSubscriptionId;

    @AppSettingsDefault("partner@example.com")
    @Column(name = "TICKET_STR_USER_ID")
    private String ticketStrUserId;
}
