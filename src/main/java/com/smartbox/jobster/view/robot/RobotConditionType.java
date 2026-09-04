package com.smartbox.jobster.view.robot;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum RobotConditionType implements EnumClass<String> {
    FIELD("FIELD"),
    QUESTION("QUESTION"),
    QUIZ("QUIZ"),
    MANAGER_INTERVIEW("MANAGER_INTERVIEW"),
    MANAGER_RESPONSE("MANAGER_RESPONSE");

    private final String id;

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    RobotConditionType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static RobotConditionType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
