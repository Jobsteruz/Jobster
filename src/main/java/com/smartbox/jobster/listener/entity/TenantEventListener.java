package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.pojo.RegCompanyPojo;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.NavigationService;
import io.jmix.core.DataManager;
import io.jmix.core.event.EntityChangedEvent;
import io.jmix.multitenancy.entity.Tenant;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * Since: 12/27/2023 12:27 PM
 */
@Component
public class TenantEventListener {

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.jb.template.reg-tenant.routing-key}")
    private String regTenantRoutingKey;

    @Qualifier("rabbitTemplate")
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private NavigationService navigationService;
    @Autowired
    private CompanyService companyService;


    @EventListener
    void onTenantChangedBeforeCommit(EntityChangedEvent<Tenant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
