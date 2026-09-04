package com.smartbox.jobster.pojo.ai;

import com.smartbox.jobster.exceptions.AIPojoCastException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 22/05/24 12:35
 */


@Getter
@ToString
public abstract class AbstractAIService<T extends Serializable> implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(AbstractAIService.class);
    @Setter(value = AccessLevel.PRIVATE)
    protected String type;

    @Setter(value = AccessLevel.PRIVATE)
    protected UUID id;


    public AbstractAIService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // DT = Desired Type
    public <DT> DT parse() throws AIPojoCastException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <DT> Optional<DT>  parseOpt() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
