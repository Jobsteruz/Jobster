package com.smartbox.jobster.job;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.service.tg.BotService;
import io.jmix.core.Messages;
import io.jmix.core.security.Authenticated;
import lombok.RequiredArgsConstructor;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;


@Component("jb_AttendanceJob")
@RequiredArgsConstructor
public class AttendanceJob implements Job {
    private static final Logger log = LoggerFactory.getLogger(AttendanceJob.class);

    private final AttendanceService attendanceService;
    private final MQService mQService;
    private final BotService botService;
    private final TranslateService translateService;
    private final Messages messages;

    @Value("${spring.rabbitmq.listen}")
    private String listen;


    @Override
    @Authenticated
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(Employee employee, SettingType settingType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String translateSettingType(SettingType type, Bot bot, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String translateSetting(Setting setting, SettingType type, Language language) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}