package com.smartbox.jobster.config.mq;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SMS listener uchun alohida container factory: PARALLEL consumer'lar + past prefetch.
 * <p>
 * Default factory 1 consumer + prefetch=250 edi — bitta thread barcha SMS'ni ketma-ket ishlab,
 * sekin gateway (Eskiz) tufayli navbat qotib qolardi (250 unacked, sekin drenaj). Bir nechta thread
 * parallel yuboradi; past prefetch thread'lar/instance'lar orasida adolatli taqsimlaydi va unacked
 * metrikasini haqiqiy holatda ushlaydi (robot queue'laridagi past-prefetch yondashuvi kabi).
 * <p>
 * XAVFSIZ (bir kishining kodi boshqasiga / Telegram'ga ketmaydi): har xabar o'z {@code SmsPojo}'si
 * (metod parametri) bilan ishlanadi; EskizService / AurumStellaService / SmsQueueListener'da
 * per-message SHARED field yo'q — faqat lokal o'zgaruvchilar. Yagona umumiy holat — Eskiz token
 * (akkaunt darajasida, hammaga bir xil, thread-safe). Kanal (SMS/TG/email) esa navbatga qo'yishdan
 * oldin, boshqa navbatlar orqali hal qilinadi.
 */
@Configuration
public class SmsMQConfiguration {

    @Bean
    public SimpleRabbitListenerContainerFactory smsListenerContainerFactory(
            SimpleRabbitListenerContainerFactoryConfigurer configurer,
            ConnectionFactory connectionFactory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
