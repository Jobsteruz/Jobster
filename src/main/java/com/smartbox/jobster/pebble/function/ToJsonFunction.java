package com.smartbox.jobster.pebble.function;


import com.smartbox.jobster.$;
import com.smartbox.jobster.service.attendance.AttendanceDTO;
import com.smartbox.jobster.service.attendance.AttendanceOneDayDTO;
import io.pebbletemplates.pebble.extension.Function;
import io.pebbletemplates.pebble.template.EvaluationContext;
import io.pebbletemplates.pebble.template.PebbleTemplate;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Author: Clean
 * Since: 3/14/2025 4:36 PM
 */
public class ToJsonFunction implements Function {
    public Locale locale;

    public ToJsonFunction(Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object execute(Map<String, Object> args, PebbleTemplate self, EvaluationContext context, int lineNumber) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<String> getArgumentNames() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
