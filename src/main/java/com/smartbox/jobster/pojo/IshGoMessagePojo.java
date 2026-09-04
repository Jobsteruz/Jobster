package com.smartbox.jobster.pojo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * Async payload for an ISHGO applicant message (see {@code MQService#sendIshGoMessage} and
 * {@code IshGoMessageQueueListener}). Java-serialized over RabbitMQ, so it must stay Serializable.
 */
@Getter
@Setter
@RequiredArgsConstructor
public class IshGoMessagePojo implements Serializable {
    @Serial
    private static final long serialVersionUID = 6631472901554238810L;

    private final String platformId;

    private final String text;
}
