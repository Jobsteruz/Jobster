package com.smartbox.jobster.listener.mq;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.vision.Attendance;
import com.smartbox.jobster.entity.vision.TgAttendConfig;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.SettingTypeService;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.service.attendance.AttendanceTelegramKeyboardService;
import io.jmix.core.DataManager;
import io.jmix.core.Id;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.core.security.Authenticated;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class AttendanceQueueListener {
    private static final Logger log = LoggerFactory.getLogger(AttendanceQueueListener.class);
    private final DataManager dataManager;
    private final Messages messages;
    private final AttendanceService attendanceService;
    private final InstanceNameProvider instanceNameProvider;
    private final MQService mQService;
    private final SettingTypeService settingTypeService;
    private final AttendanceTelegramKeyboardService attendanceTelegramKeyboardService;


    @RabbitListener(queues = "${spring.rabbitmq.jb.template.attendance-queue}")
    @Authenticated
    public void listen(Id<Attendance> attendanceId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(TgUser tgUser, Bot bot, String text, Keyboard keyboard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}