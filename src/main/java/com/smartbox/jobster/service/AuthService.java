package com.smartbox.jobster.service;


import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.CompanyConfig;
import com.smartbox.jobster.entity.company.ConfirmationToken;
import com.smartbox.jobster.entity.company.TemporaryCompany;
import com.smartbox.jobster.entity.config.TwoStepBotSetting;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.TimeSource;
import io.jmix.core.UnconstrainedDataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.StringJoiner;

@Service
public class AuthService {
    private static final Logger log = LoggerFactory.getLogger(AuthService.class);

    @Autowired
    private UnconstrainedDataManager dataManager;
    @Autowired
    private VerificationService verificationService;
    @Autowired
    private TimeSource timeSource;

    // uses dataManager.unconstrained()
    public ConfirmationToken getConfirmationTokenByTemporaryCompany(TemporaryCompany temporaryCompany) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // uses dataManager.unconstrained()
    public ConfirmationToken getConfirmationTokenByToken(String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // send login view 2-step verification code (supports multiple platforms)
    public String send2StepVerificationCode(CompanyConfig config, Employee employee, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void informLoginAttempt(Employee employee, String code, String by) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
