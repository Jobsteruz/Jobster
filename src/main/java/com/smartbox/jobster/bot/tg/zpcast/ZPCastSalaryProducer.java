package com.smartbox.jobster.bot.tg.zpcast;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.smartbox.jobster.service.zpcast.PrettyDataService;

import java.util.Date;

public class ZPCastSalaryProducer extends AbstractBotObject implements Producer {
    Date date;

    public ZPCastSalaryProducer(BotContext botContext, Date date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
