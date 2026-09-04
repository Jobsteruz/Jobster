package com.smartbox.jobster.pojo.hh;

public class SimpleVacancyDTO {
    private String id;
    private String displayName;
    private String departmentShortName;

    public SimpleVacancyDTO() {}

    public SimpleVacancyDTO(String id, String displayName, String departmentShortName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }

    public String getDepartmentShortName() { return departmentShortName; }
    public void setDepartmentShortName(String departmentShortName) { this.departmentShortName = departmentShortName; }
}
