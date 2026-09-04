package com.smartbox.jobster.view.experience;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;


@Getter
public enum ISHGOExperience implements EnumClass<Integer> {

    FRESH(-1),
    EXPERIENCE_0_1(0),
    EXPERIENCE_1_3(1),
    EXPERIENCE_3_6(3),
    EXPERIENCE_6_PLUS(6);

    private final Integer id;

    ISHGOExperience(Integer id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static ISHGOExperience fromId(Integer id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
