package com.smartbox.jobster.pojo.gson_adapters;


import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class IgnoreFailureTypeAdapterFactory implements TypeAdapterFactory {

    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T> TypeAdapter<T> createCustomTypeAdapter(TypeAdapter<T> delegate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}