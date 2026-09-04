package com.smartbox.jobster.entity.vision;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.ref.Language;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetTime;

@JmixEntity
@Table(name = "JB_TG_ATTEND_CONFIG", indexes = {
        @Index(name = "IDX_JB_TG_ATTEND_CONFIG_LANGUAGE", columnList = "LANGUAGE_ID")
})
@Entity(name = "jb_TgAttendConfig")
@Getter
@Setter
public class TgAttendConfig extends StandardTenantEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 5002941194422995530L;

    @Secret
    @Column(name = "MONITORING_BOT_TOKEN")
    private String monitoringBotToken;

    @Secret
    @Column(name = "MONITORING_GROUP_ID")
    private String monitoringGroupId;

    @Column(name = "MONITORING_MSG_THREAD_ID")
    private Integer monitoringMsgThreadId;

    @JoinColumn(name = "LANGUAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Language language;

    @Column(name = "OVERTIME_AUTO_OUT_TIME")
    private OffsetTime overtimeAutoOutTime;
}