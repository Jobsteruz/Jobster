package com.smartbox.jobster.config.validator;

import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.service.RobotCachingService;
import com.smartbox.jobster.service.robot.RobotService;
import io.jmix.core.Messages;
import io.jmix.flowui.component.validation.Validator;
import io.jmix.flowui.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jb_RobotIntervalValidator")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class RobotIntervalValidator implements Validator<Robot> {
    @Autowired
    private RobotService robotService;

    @Autowired
    private Messages messages;

    @Override
    public void accept(Robot robot) throws ValidationException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}