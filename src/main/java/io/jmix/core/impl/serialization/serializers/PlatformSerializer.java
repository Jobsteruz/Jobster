package io.jmix.core.impl.serialization.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.smartbox.jobster.entity.ats.Platform;

import java.lang.reflect.Type;

public class PlatformSerializer implements JsonSerializer<Platform> {
    @Override
    public JsonElement serialize(Platform platform, Type type, JsonSerializationContext jsonSerializationContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
