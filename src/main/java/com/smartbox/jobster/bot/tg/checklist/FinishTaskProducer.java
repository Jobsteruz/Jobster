package com.smartbox.jobster.bot.tg.checklist;


import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.CallbackConsumer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.checklist.Checklist;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;

import java.util.List;

/**
 * @author Jobster team
 * Since: 12/11/2024 8:30 PM
 */
public class FinishTaskProducer extends AbstractBotObject implements Producer {
    Checklist checklist;

    public FinishTaskProducer(BotContext botContext, Checklist checklist) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
