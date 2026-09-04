package com.smartbox.jobster.trello;

import com.vaadin.flow.component.Component;

@FunctionalInterface
public interface CloneFunction {

    /**
     * Clone the component
     *
     * @param component component to clone
     * @return clone of the component
     */
    Component clone(Component component);
}