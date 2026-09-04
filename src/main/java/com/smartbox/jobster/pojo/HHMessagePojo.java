package com.smartbox.jobster.pojo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/**
 * Async payload for an outgoing HH negotiation message (see {@code MQService#sendHHMessage} and
 * {@code HHMessageQueueListener}). Java-serialized over RabbitMQ, so it must stay Serializable.
 * <p>
 * {@code username} carries the sender because the HH access token hangs off that user's
 * {@code IntegratedUser}, and the entity loads behind it are tenant-scoped. The listener
 * re-authenticates as this user ({@code SystemAuthenticator#begin}) before sending — same approach
 * as {@code HHQueueListener}/{@code HHPojo} on the inbound side.
 */
@Getter
@Setter
@RequiredArgsConstructor
public class HHMessagePojo implements Serializable {
    @Serial
    private static final long serialVersionUID = -4402173350091755743L;

    private final String username;

    /** HH negotiation id — {@code Applicant.platformId}. */
    private final String platformId;

    private final String text;

    /**
     * Applicant'ning mas'ul xodimi ({@code Applicant.responsible}) — HH negotiation aynan uning
     * akkauntida turadi, shuning uchun token o'shanikidan olinadi. {@code username} esa jo'natuvchi
     * bo'lib qoladi: listener autentifikatsiyani (tenant bilan birga) o'sha bo'yicha tiklaydi.
     */
    private final UUID responsibleId;
}
