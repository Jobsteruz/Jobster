package com.smartbox.jobster.view.monitoring.loader;

import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Jobster team
 * date: 20/08/24 10:18
 */
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class DataContext<E> {

    private final CollectionLoader<E> loader;
    private CollectionContainer<E> container;

}