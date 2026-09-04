package com.smartbox.jobster.config.cron;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.vision.Attendance;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.SettingTypeService;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.service.attendance.AttendanceTelegramKeyboardService;
import io.jmix.core.security.Authenticated;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Component("jb_CronAttendanceJob")
@RequiredArgsConstructor
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronAttendanceJob {
    private static final Logger log = LoggerFactory.getLogger(CronAttendanceJob.class);

    private static final int PRE_START_WINDOW_MINUTES = 10;
    private static final int REMINDER_MIN_MINUTES = 10;
    private static final int REMINDER_MAX_MINUTES = 39;

    private final AttendanceService attendanceService;
    private final MQService mQService;
    private final SettingTypeService settingTypeService;
    private final AttendanceTelegramKeyboardService attendanceTelegramKeyboardService;


    @Authenticated
    @Scheduled(cron = "0 0/10 * * * ?", zone = "Asia/Tashkent", scheduler = "attendanceJobScheduled")
    public void cronRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void runStage(String stage, Runnable action) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    @Scheduled(cron = "0 0 * * * ?", zone = "Asia/Tashkent", scheduler = "attendanceJobScheduled")
    public void cronOvertimeRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendMessage(Employee employee, SettingType settingType, Map<String, String> settingTextMemo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendCheckInReminderWithButtons(Employee employee, Attendance lastAttendance,
                                                Map<String, String> settingTextMemo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendToEmployee(TgUser tgUser, Bot bot, String text, Keyboard keyboard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
