package com.smartbox.jobster.entity.core;

/**
 * @author Jobster team
 * Date: 05/07/2023 16:15
 */
public interface HasName {
    String NAME = "name";

    String getName();

    void setName(String name);

    interface HasShortName {
        String SHORT_NAME = "shortName";

        String getShortName();

        void setShortName(String shortName);
    }

    interface HasTinyName {
        String TINY_NAME = "tinyName";

        String getTinyName();

        void setTinyName(String tinyName);
    }
}
