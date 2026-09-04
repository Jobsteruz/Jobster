package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.entity.tg.Bot;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SETTING")
@Entity(name = "jb_Setting")
@Getter
@Setter
public class Setting extends AbstractSetting implements Serializable {

    @Serial
    private static final long serialVersionUID = 8369353974211498758L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "BOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bot bot;

}