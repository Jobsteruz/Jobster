package com.smartbox.jobster.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum FileSize implements EnumClass<String> {



    TINY("tiny"),           // 50x50
    SMALL("small"),         // 200x200
    MEDIUM("medium"),       // 400x400
    LARGE("large"),         // 800x800
    ORIGINAL("original");
    private final String id;
    FileSize(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    @Nullable
    public static FileSize fromId(String id) {
        for (FileSize at : FileSize.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}