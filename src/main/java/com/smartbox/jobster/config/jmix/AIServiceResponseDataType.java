package com.smartbox.jobster.config.jmix;

import com.smartbox.jobster.pojo.ai.response.AbstractAIServiceResponse;
import com.smartbox.jobster.pojo.ai.converter.ResponsePojoConverter;
import io.jmix.core.metamodel.annotation.DatatypeDef;
import io.jmix.core.metamodel.annotation.Ddl;
import io.jmix.core.metamodel.datatype.Datatype;
import org.postgresql.util.PGobject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author Jobster team
 * date: 22/05/24 11:47
 */

@DatatypeDef(
        id = "aiServiceResponse",
        javaClass = AbstractAIServiceResponse.class,
        defaultForClass = true
)
@Ddl(value = AIServiceResponseDataType.PSQL_DATA_TYPE)
public class AIServiceResponseDataType implements Datatype<AbstractAIServiceResponse<? extends Serializable>> {
    private static final Logger log = LoggerFactory.getLogger(AIServiceResponseDataType.class);
    public static final String PSQL_DATA_TYPE = "jsonb";

    @Override
    public String format(Object value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String format(Object value, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public AbstractAIServiceResponse<? extends Serializable> parse(String value) throws ParseException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public AbstractAIServiceResponse<? extends Serializable> parse(String value, Locale locale) throws ParseException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
