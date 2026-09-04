package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.service.robot.preload.RobotPreloadData;
import com.smartbox.jobster.service.robot.preload.RobotPreloadHolder;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.function.Supplier;

@Service
public class AdditionalQuestService {

    @Autowired
    private DataManager dataManager;


    public Double getLastPersonScoreOrThrowError(TempQuestionnaire tempQuestionnaire, Person person, Supplier<RuntimeException> errorSupplier) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
