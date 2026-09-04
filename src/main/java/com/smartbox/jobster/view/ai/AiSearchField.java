package com.smartbox.jobster.view.ai;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.jetbrains.annotations.NotNull;
import org.springframework.lang.Nullable;

public enum AiSearchField implements EnumClass<String> {
    // Main applicant fields


    POSITION("position"),
    DEPARTMENT("department"),
    RESPONSIBLE("responsible"),
    EDUCATION("education"),
    EXPERIENCE("experience"),
    SALARY_LEVEL("salaryLevel"),
    WORK_SCHEDULE("workSchedule"),
    PLATFORM("platform"),
    SOURCE("source"),
    EMPLOYEE_OR_NOT("employeeOrNot"),
    FIRSTNAME("firstName"),
    LASTNAME("lastName"),
    MIDDLENAME("middleName"),
    FULLNAME("fullName"),
    BIRTHDATE("birthDate"),
    GENDER("gender"),
    ADDRESS("address"),
    ADDRESS2("address2"),
    POSTALCODE("postalCode"),
    LATITUDE("latitude"),
    LONGITUDE("longitude"),
    EMAIL("email"),
    PHONE("phone"),
    PHONE2("phone2"),
    GROUP("group"),
    OFFERED_POSITON("offeredPositon"),
    CATEGORY("category"),
    STATUS("status"),
    COUNTRY("country"),
    REGION("region"),
    MARITAL_STATUS("maritalStatus"),
    NUM_OF_CHILDREN("numOfChildren"),
    MEMO("memo"),
    SCORE("score"),
    FAVORITE("favorite"),
    QUESTIONNAIRE("questionnaire"),
    FILLDATE("fillDate"),
    CODE("code"),
    ID("id"),
    EXPERIENCES_ID("experiences.id"),
    EXPERIENCES_ENTITY_ID("experiences.entityId"),
    EXPERIENCES_COMPANY_NAME("experiences.companyName"),
    EXPERIENCES_DESCRIPTION("experiences.description"),
    EXPERIENCES_ORGANIZATION("experiences.organization"),
    EXPERIENCES_POSITION("experiences.position"),
    EXPERIENCES_FROM("experiences.from"),
    EXPERIENCES_TO("experiences.to"),
    EDUCATIONS_ID("educations.id"),
    EDUCATIONS_ENTITY_ID("educations.entityId"),
    EDUCATIONS_NAME("educations.name"),
    EDUCATIONS_DESCRIPTION("educations.description"),
    EDUCATIONS_LEVEL("educations.level"),
    EDUCATIONS_SPECIALIST("educations.specialist"),
    EDUCATIONS_FROM("educations.from"),
    EDUCATIONS_TO("educations.to");

    private final String id;

    AiSearchField(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public @NotNull String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AiSearchField fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}