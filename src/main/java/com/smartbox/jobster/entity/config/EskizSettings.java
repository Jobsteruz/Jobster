package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.defaults.AppSettingsDefaultInt;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Jobster team
 * Since: 5/6/2024 2:11 PM
 */
@JmixEntity
@Table(name = "ESKIZ_SETTINGS")
@Entity
@Getter
@Setter
public class EskizSettings extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = 3590715505221038166L;

    @Column(name = "ESKIZ_USER_EMAIL")
    private String eskizUserEmail;

    @Secret
    @Column(name = "ESKIZ_USER_PASSWORD")
    private String eskizUserPassword;

    @AppSettingsDefault("JOBSTER")
    @Column(name = "ESKIZ_GATEWAY_FROM")
    private String eskizGatewayFrom;

    @AppSettingsDefault("99897")
    @Column(name = "ESKIZ_GATEWAY_PHONE_SKIP")
    private String eskizGatewayPhoneSkip;

    @AppSettingsDefault("4546")
    @Column(name = "ESKIZ_GATEWAY_NO_ALPHA_NAME")
    private String eskizGatewayNoAlphaName;

    @Column(name = "ESKIZ_GATEWAY_URL")
    private String eskizGatewayUrl;

    @AppSettingsDefaultInt(8)
    @Column(name = "ESKIZ_GATEWAY_CODE")
    private Integer eskizGatewayCode;
}
