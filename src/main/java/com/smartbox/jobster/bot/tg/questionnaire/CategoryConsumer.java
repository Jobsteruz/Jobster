package com.smartbox.jobster.bot.tg.questionnaire;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.entity.company.DepartmentCategory;

public class CategoryConsumer extends AbstractEntityObject<DepartmentCategory> implements Consumer {
    DepartmentCategory category;

    public CategoryConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public DepartmentCategory t() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
