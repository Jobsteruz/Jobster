package com.smartbox.jobster.config.jmix;

import com.smartbox.jobster.pojo.ai.converter.RequestPojoConverter;
import com.smartbox.jobster.pojo.ai.request.AbstractAIServiceRequest;
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
 * date: 22/05/24 13:42
 */
@DatatypeDef(
        id = "aiServiceRequest",
        javaClass = AbstractAIServiceRequest.class,
        defaultForClass = true
)
@Ddl(value = AIServiceRequestDataType.PSQL_DATA_TYPE)
public class AIServiceRequestDataType implements Datatype<AbstractAIServiceRequest<? extends Serializable>> {
    private static final Logger log = LoggerFactory.getLogger(AIServiceRequestDataType.class);
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
    public AbstractAIServiceRequest<? extends Serializable> parse(String value) throws ParseException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public AbstractAIServiceRequest<? extends Serializable> parse(String value, Locale locale) throws ParseException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
