package com.smartbox.jobster.job;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.EmployeeState;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.security.Authenticated;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component("jb_EmployeeStateJob")
public class EmployeeStateJob implements Job {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DataManager dataManager;

    @Authenticated
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
