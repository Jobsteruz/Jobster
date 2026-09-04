package com.smartbox.jobster.view.reports.stage_entity_movement;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;

import java.time.Month;


@Getter
public enum MonthlyInterval implements EnumClass<String> {

    JANUARY("JANUARY", Month.JANUARY, Month.JANUARY),
    FEBRUARY("FEBRUARY", Month.FEBRUARY, Month.FEBRUARY),
    MARCH("MARCH", Month.MARCH, Month.MARCH),
    FIRST_QUARTER("FIRST_QUARTER", Month.JANUARY, Month.MARCH),
    APRIL("APRIL", Month.APRIL, Month.APRIL),
    MAY("MAY", Month.MAY, Month.MAY),
    JUNE("JUNE", Month.JUNE, Month.JUNE),
    SECOND_QUARTER("SECOND_QUARTER", Month.APRIL, Month.JUNE),
    JULY("JULY", Month.JULY, Month.JULY),
    AUGUST("AUGUST", Month.AUGUST, Month.AUGUST),
    SEPTEMBER("SEPTEMBER", Month.SEPTEMBER, Month.SEPTEMBER),
    THIRD_QUARTER("THIRD_QUARTER", Month.JULY, Month.SEPTEMBER),
    OCTOBER("OCTOBER", Month.OCTOBER, Month.OCTOBER),
    NOVEMBER("NOVEMBER", Month.NOVEMBER, Month.NOVEMBER),
    DECEMBER("DECEMBER", Month.DECEMBER, Month.DECEMBER),
    FOURTH_QUARTER("FOURTH_QUARTER", Month.OCTOBER, Month.DECEMBER);

    private final String id;
    private final Month startMonth;
    private final Month endMonth;

    MonthlyInterval(String id, Month startMonth, Month endMonth) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static MonthlyInterval fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}