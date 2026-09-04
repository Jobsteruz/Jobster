package com.smartbox.jobster.service;

import com.smartbox.jobster.controller.open.SecondQuestionnaireController;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.SecondQuestionnaire;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.$;
import io.jmix.core.DataManager;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SecondQuestionnaireService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
    @Autowired
    private Environment environment;
    @Autowired
    private TranslateService translateService;

    public SecondQuestionnaire sendSecondQuestionnaire(Person person, Questionnaire questionnaire, AutoFillTemplate template, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private AutoFillTemplate generateQuestionnaireLink(JbEntity<UUID> secondQuestionnaire, AutoFillTemplate template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
