package com.smartbox.jobster.view.reports.abstracthasperiodreport;

import io.jmix.core.metamodel.datatype.EnumClass;

import lombok.Getter;
import org.springframework.lang.Nullable;


@Getter
public enum ReportPeriod implements EnumClass<String> {




    CUSTOM("CUSTOM"),
    TODAY("TODAY"),
    THIS_WEEK("THIS_WEEK"),
    THIS_MONTH("THIS_MONTH"),
    THIS_QUARTER("THIS_QUARTER"),
    THIS_YEAR("THIS_YEAR"),
    YESTERDAY("YESTERDAY"),
    LAST_WEEK("LAST_WEEK"),
    LAST_MONTH("LAST_MONTH"),
    LAST_QUARTER("LAST_QUARTER"),
    LAST_YEAR("LAST_YEAR"),
    SINCE_LAST_30_DAYS("SINCE_LAST_30_DAYS"),
    SINCE_LAST_60_DAYS("SINCE_LAST_60_DAYS"),
    SINCE_LAST_90_DAYS("SINCE_LAST_90_DAYS"),
    SINCE_LAST_365_DAYS("SINCE_LAST_365_DAYS"),
    TOMORROW("TOMORROW"),
    NEXT_WEEK("NEXT_WEEK"),
    NEXT_MONTH("NEXT_MONTH"),
    NEXT_QUARTER("NEXT_QUARTER"),
    NEXT_YEAR("NEXT_YEAR");

    private final String id;

    ReportPeriod(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static ReportPeriod fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}