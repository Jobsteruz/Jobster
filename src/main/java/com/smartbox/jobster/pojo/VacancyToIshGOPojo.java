package com.smartbox.jobster.pojo;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record VacancyToIshGOPojo(UUID id, String ishgoId, String locale, VacancyAction action,
                                 String authenticationLogin, String inn) implements Serializable {
    @Serial
    private static final long serialVersionUID = 5444781540805711199L;
}
