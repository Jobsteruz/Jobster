package io.jmix.core.impl.serialization.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import io.jmix.core.FileRef;

import java.lang.reflect.Type;

public class FileRefSerializer implements JsonSerializer<FileRef> {
    @Override
    public JsonElement serialize(FileRef fileRef, Type type, JsonSerializationContext jsonSerializationContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
