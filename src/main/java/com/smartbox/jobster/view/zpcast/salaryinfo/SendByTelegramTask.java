package com.smartbox.jobster.view.zpcast.salaryinfo;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.tg.BotService;
import com.smartbox.jobster.service.zpcast.PrettyDataService;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;

import java.util.List;

public class SendByTelegramTask extends SendMessageTask {


    public SendByTelegramTask(SalaryInfo salaryInfo, List<SalaryData> salaryDataList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Long sendMessage(TaskLifeCycle<Integer> taskLifeCycle) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
