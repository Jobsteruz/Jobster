package com.smartbox.jobster.entity.config;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.defaults.AppSettingsDefaultDouble;
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

@Getter
@Setter
@JmixEntity
@Table(name = "JB_NETWORK_SETTINGS")
@Entity(name = "jb_NetworkSettings")
public class NetworkSettings extends AppSettingsEntity implements Serializable {
    private static final long serialVersionUID = 4915182294703734741L;

    // for external APIs calling j4 endpoints
    @Column(name = "k8s_adapter_host")
    private String k8sAdapterHost;

    // to avoid session expire for tech-support
    @Column(name = "trusted_session_ip")
    private String trustedSessionIp;

    @Column(name = "whatsapp_proxy_server_host")
    private String whatsappProxyServerHost;

    @Column(name = "chatgpt_url")
    private String chatGptUrl;

    @Secret
    @Column(name = "chatgpt_key")
    private String chatGptKey;

    @Secret
    @Column(name = "doing_task_key")
    private String doingTaskKey;

    @Column(name = "ai_call_api_url")
    private String aiCallApiUrl;

    @Column(name = "ai_call_api_username")
    private String aiCallApiUsername;

    @Secret
    @Column(name = "ai_call_api_password")
    private String aiCallApiPassword;

    @AppSettingsDefaultInt(value = 7 * 24 * 60 * 60)
    @Column(name = "trusted_device_max_age")
    private Integer trustedDeviceMaxAge;

    // AI Token Pricing (per 1M tokens)
    @AppSettingsDefaultDouble(value = 0.15)
    @Column(name = "ai_flash_input_price")
    private Double aiFlashInputPrice;

    @AppSettingsDefaultDouble(value = 0.60)
    @Column(name = "ai_flash_output_price")
    private Double aiFlashOutputPrice;

    @AppSettingsDefaultDouble(value = 1.25)
    @Column(name = "ai_pro_input_price")
    private Double aiProInputPrice;

    @AppSettingsDefaultDouble(value = 10.00)
    @Column(name = "ai_pro_output_price")
    private Double aiProOutputPrice;
}