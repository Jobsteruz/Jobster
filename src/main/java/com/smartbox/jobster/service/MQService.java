package com.smartbox.jobster.service;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.listener.mq.TgQueueListener;
import com.smartbox.jobster.pojo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Jobster team
 * Since: 12/14/2023 3:07 PM
 */
@Service
public class MQService {
    private static final Logger log = LoggerFactory.getLogger(MQService.class);

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.tg.routing-key}")
    private String tgRoutingKey;
    @Value("${spring.rabbitmq.jb.template.sms.routing-key}")
    private String smsRoutingKey;
    @Value("${spring.rabbitmq.jb.template.mail.routing-key}")
    private String mailRoutingKey;
    @Value("${spring.rabbitmq.jb.template.ticket.routing-key}")
    private String ticketRoutingKey;
    @Value("${spring.rabbitmq.jb.template.ishgo.routing-key}")
    private String ishgoRoutingKey;
    @Value("${spring.rabbitmq.jb.template.hh-message.routing-key}")
    private String hhMessageRoutingKey;
    @Value("${spring.rabbitmq.jb.template.outlook-mail.routing-key}")
    private String outlookMailRoutingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private DirectExchange directExchange;
    @Autowired
    private AmqpAdmin amqpAdmin;
    @Autowired
    private ConnectionFactory connectionFactory;

    public void sendTgMessage(String tenantId, TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMassTgMessage(String tenantId, TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // Consumer faqat ACTIVE tenant'larga ochiladi (StartTgQueueConsumers) — INACTIVE tenant xabari
    // egasiz per-tenant queue'da abadiy yig'ilmasin deb producer'da to'sib qo'yamiz.
    // Lookup xatosida fail-open: xabarni hech qachon shu guard sabab yo'qotmaymiz.
    private boolean skipInactiveTenant(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendSms(SmsPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMail(MailPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendTicket(TicketPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendIshGoMessage(IshGoMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendHHMessage(HHMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendOutlookMail(OutlookMailPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String tgQueueName(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String tgRoutingKey(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String messageTgQueueName(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String messageTgRoutingKey(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void declareTgQueue(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void declareMessageTgQueue(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void startQueueListener(String queueName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
