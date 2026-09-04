package com.smartbox.jobster.bot.tg.manager;


import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.manager.producer.ManagerProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.TgUserState;
import com.smartbox.jobster.service.ApplicantStatusChangeService;
import com.smartbox.jobster.service.kanban.ManagerAcceptStageTransferService;

/**
 * @author Jobster team
 * Since: 12/26/2025 11:48 AM
 */
public class ManagerPersonCommentConsumer extends AbstractManagerBotObject implements Consumer {

    public ManagerPersonCommentConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
