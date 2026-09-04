package com.smartbox.jobster.bot.tg.branch;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUserState;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 4/15/2025 4:34 PM
 */
public class BranchListProducer extends AbstractBotObject implements Producer {
    Department selectedBranch;

    public BranchListProducer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public BranchListProducer(BotContext botContext, Department branch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendBranchInfo() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
