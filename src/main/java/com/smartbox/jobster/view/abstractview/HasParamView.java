package com.smartbox.jobster.view.abstractview;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Jobster team
 * Since: 6/20/2024 5:11 PM
 */
public interface HasParamView {

    JSONObject params();

    default <T> List<T> parse(String id, Function<Object, T> function) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default <T> T cast(Object obj, Class<T> clazz) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
