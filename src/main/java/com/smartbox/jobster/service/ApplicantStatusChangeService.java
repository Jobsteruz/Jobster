package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.CompanyConfig;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ApplicantStatusChangeService {
    private final CompanyService companyService;
    private final AutoFillTemplateService autoFillTemplateService;
    private final EntityService entityService;

    public void sendNotification2Responsible(Applicant applicant, Employee manager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
