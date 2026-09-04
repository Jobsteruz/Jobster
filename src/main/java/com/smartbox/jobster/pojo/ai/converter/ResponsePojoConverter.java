package com.smartbox.jobster.pojo.ai.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.smartbox.jobster.config.jmix.AIServiceResponseDataType;
import com.smartbox.jobster.pojo.ai.response.AbstractAIServiceResponse;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.postgresql.util.PGobject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * @author Jobster team
 * date: 20/05/24 18:42
 */
@Converter(autoApply = true)
public class ResponsePojoConverter implements AttributeConverter<AbstractAIServiceResponse<? extends Serializable>, PGobject> {
    private static final Logger log = LoggerFactory.getLogger(ResponsePojoConverter.class);
    public static final Gson GSON = new GsonBuilder()
            .serializeNulls()
            .setPrettyPrinting()
            .create();

    @Override
    public PGobject convertToDatabaseColumn(AbstractAIServiceResponse<? extends Serializable> pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public AbstractAIServiceResponse<? extends Serializable> convertToEntityAttribute(PGobject dbData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
