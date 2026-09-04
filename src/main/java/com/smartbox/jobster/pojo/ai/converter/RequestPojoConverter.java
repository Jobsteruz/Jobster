package com.smartbox.jobster.pojo.ai.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.smartbox.jobster.config.jmix.AIServiceRequestDataType;
import com.smartbox.jobster.pojo.ai.request.AbstractAIServiceRequest;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.postgresql.util.PGobject;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * @author Jobster team
 * date: 20/05/24 18:42
 */
@Converter(autoApply = true)
public class RequestPojoConverter implements AttributeConverter<AbstractAIServiceRequest<? extends Serializable>, PGobject> {
    public static final Gson GSON = new GsonBuilder().serializeNulls()
            .setPrettyPrinting()
            .create();

    @Override
    public PGobject convertToDatabaseColumn(AbstractAIServiceRequest<? extends Serializable> pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public AbstractAIServiceRequest<? extends Serializable> convertToEntityAttribute(PGobject dbData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
