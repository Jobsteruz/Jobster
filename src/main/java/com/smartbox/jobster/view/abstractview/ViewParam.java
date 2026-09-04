package com.smartbox.jobster.view.abstractview;

import lombok.*;

import java.util.List;

/**
 * @author Jobster team
 * date: 12/08/24 11:09
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ViewParam {

    private ViewParam parent;
    private List<ViewParam> children;

    private String key;
    private Boolean required;
    private Type type;
    private String description;


    public enum Type {

        STRING,
        INTEGER,
        JSON_ARRAY,
        JSON_OBJECT
    }
}