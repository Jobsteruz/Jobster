package com.smartbox.jobster.service.zpcast;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.entity.zpcast.SalaryInfo;
import com.smartbox.jobster.view.zpcast.salaryinfo.SendMessageTask;
import io.jmix.core.TimeSource;
import io.jmix.core.UnconstrainedDataManager;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.Dialogs;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class SalaryService {
    public final String EXCEL_EMPLOYEE_PINFL = "ПИНФЛ";
    public final String EXCEL_EMPLOYEE_NAME = "Сотрудник";
    public final String EXCEL_EMPLOYEE_PHONE = "Физическое лицо.Мобильный телефон";
    public final String EXCEL_EMPLOYEE_EMAIL = "Email";
    public final String EXCEL_EMPLOYEE_POSITION = "Должность";

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private Dialogs dialogs;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private UnconstrainedDataManager dataManager;

    public SalaryInfo findBy(Integer month, Integer year) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public void dropAllBySalaryInfo(SalaryInfo salaryInfo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SalaryData findSalaryData(Employee employee, SalaryInfo salaryInfo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<SalaryData> findBySalaryInfo(SalaryInfo salaryInfo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createBackgroundTask(SendMessageTask sendMessageTask, String header, String text, int size) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SalaryData getSalaryDataByMonth(Employee employee, Date date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<String> fetchMonths(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
