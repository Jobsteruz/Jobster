package com.smartbox.jobster.bot.tg.request;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.service.RequestService;
import com.smartbox.jobster.service.person.EmployeeService;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Manager bot — "Заявки / Active requests" ekrani.
 * Jobster3 dagi {@code RequestProducer} (PostType.REQUESTS) ekvivalenti.
 * Manager o'z departamentlariga tegishli aktiv requestlarni (Vacancy state=REQUEST) ko'radi.
 */
public class RequestProducer extends AbstractBotObject implements Producer {

    public RequestProducer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
