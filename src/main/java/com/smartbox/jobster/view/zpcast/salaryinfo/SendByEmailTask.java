package com.smartbox.jobster.view.zpcast.salaryinfo;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.smartbox.jobster.pojo.MailPojo;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.zpcast.PrettyDataService;
import io.jmix.flowui.backgroundtask.TaskLifeCycle;

import java.util.List;


public class SendByEmailTask extends SendMessageTask {


    public SendByEmailTask(SalaryInfo salaryInfo, List<SalaryData> salaryDataList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Long sendMessage(TaskLifeCycle<Integer> taskLifeCycle) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
