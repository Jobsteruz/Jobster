package io.jmix.core.impl.serialization.serializers;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.OffsetDateTime;

public class OffsetDateTimeSerializer implements JsonSerializer<OffsetDateTime> {
    @Override
    public JsonElement serialize(OffsetDateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
