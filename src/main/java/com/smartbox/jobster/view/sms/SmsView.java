package com.smartbox.jobster.view.sms;


import com.smartbox.jobster.pojo.SmsPojo;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

@Route(value = "sms-view", layout = MainView.class)
@ViewController(id = "jb_SmsView")
@ViewDescriptor(path = "sms-view.xml")
public class SmsView extends StandardView {


    @Value("${spring.rabbitmq.jb.template.sms.routing-key}")
    private String routingKey;

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private TenantProvider tenantProvider;

    @ViewComponent
    private TypedTextField<Object> phoneNumber;
    @ViewComponent
    private JmixTextArea textMsg;

    @Subscribe(id = "sendSms", subject = "clickListener")
    public void onSendSmsClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}