package com.smartbox.jobster.robot;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.JbEntity;
import io.jmix.core.metamodel.datatype.EnumClass;

import java.util.Objects;

/**
 * @author Jobster team
 * date: 06/05/24 14:08
 */
public interface GeneralMatchers {


    default boolean equals(Object o1, Object o2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default boolean contains(Object o1, Object o2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default boolean startsWith(Object o1, Object o2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default boolean endsWith(Object o1, Object o2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default boolean greaterThan(Object o1, Object o2) throws ClassCastException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default boolean lessThan(Object o1, Object o2) throws ClassCastException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}