package io.jmix.core.impl.serialization.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.jmix.core.metamodel.datatype.EnumClass;

import java.lang.reflect.Type;

public class EnumSerializer implements JsonSerializer<EnumClass<?>> {
    @Override
    public JsonElement serialize(EnumClass enumClass, Type type, JsonSerializationContext jsonSerializationContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
