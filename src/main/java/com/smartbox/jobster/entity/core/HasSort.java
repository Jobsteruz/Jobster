package com.smartbox.jobster.entity.core;

import java.util.Comparator;

/**
 * @author Jobster team
 * Date: 05/07/2023 16:29
 */
public interface HasSort {
    void setSort(Integer sort);

    Integer getSort();

    Comparator<? super HasSort> comparator = (Comparator<HasSort>) (o1, o2) -> {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
