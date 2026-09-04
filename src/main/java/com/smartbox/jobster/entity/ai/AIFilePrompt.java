package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_AI_FILE_PROMPT")
@Entity(name = "jb_AIFilePrompt")
@Getter
@Setter
public class AIFilePrompt extends StandardEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 8851084171073539505L;

    @InstanceName
    @Column(name = "NAME", length = 255)
    private String name;

    @Column(name = "FILE_REF", length = 1024)
    private FileRef file;

    @Column(name = "FILE_URL", length = 2000)
    private String fileUrl;

    @Lob
    @Column(name = "PROMPT")
    private String prompt;
}
