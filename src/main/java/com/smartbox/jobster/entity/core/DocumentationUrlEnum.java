package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;


@Getter
public enum DocumentationUrlEnum implements EnumClass<String> {
    BASE_URL("jb_MainView", "https://docs.jobster.hr/"),
    REQUEST_LIST_URL("jb_Request.list", "https://docs.jobster.hr/applications/"),
    VACANCY_LIST_URL("jb_Vacancy.list", "https://docs.jobster.hr/vacancies/"),
    APPLICANT_LIST_URL("jb_Applicant.list", "https://docs.jobster.hr/candidates/"),
    REGION_LIST_URL("jb_Region.list", "https://docs.jobster.hr/structure/#_2"),
    REGION_AND_DEPARTMENT_LIST_URL("jb_Region_And_jb_Department.list", "https://docs.jobster.hr/structure/#_6"),
    DEPARTMENT_LIST_URL("jb_Department.list", "https://docs.jobster.hr/structure/#_17"),
    POSITION_LIST_URL("jb_Position.list", "https://docs.jobster.hr/structure/#_8"),
    BRANCH_TYPE_LIST_URL("jb_BranchType.list", "https://docs.jobster.hr/structure/#_11"),
    POSITION_TYPE_LIST_URL("jb_PositionType.list", "https://docs.jobster.hr/structure/#_14"),
    EMPLOYEE_LIST_URL("jb_Employee.list", "https://docs.jobster.hr/company/#_6"),
    ORG_CHART_URL("jb_OrgChartView", "https://docs.jobster.hr/company/#c"),
    CHAT_BOT_LIST_URL("jb_Employee.list", "https://docs.jobster.hr/chatbot/");

    private final String viewId;
    private final String url;

    DocumentationUrlEnum(String viewId, String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static DocumentationUrlEnum fromViewId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}