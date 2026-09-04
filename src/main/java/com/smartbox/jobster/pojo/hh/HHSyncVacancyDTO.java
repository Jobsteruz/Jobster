package com.smartbox.jobster.pojo.hh;

public class HHSyncVacancyDTO {
    private String hhVacancyId;
    private String vacancyName;
    private String hhAddress;
    private String regionId;

    public HHSyncVacancyDTO() {}

    public HHSyncVacancyDTO(String hhVacancyId, String vacancyName, String hhAddress, String regionId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getHhVacancyId() { return hhVacancyId; }
    public void setHhVacancyId(String hhVacancyId) { this.hhVacancyId = hhVacancyId; }

    public String getVacancyName() { return vacancyName; }
    public void setVacancyName(String vacancyName) { this.vacancyName = vacancyName; }

    public String getHhAddress() { return hhAddress; }
    public void setHhAddress(String hhAddress) { this.hhAddress = hhAddress; }

    public String getRegionId() { return regionId; }
    public void setRegionId(String regionId) { this.regionId = regionId; }
}
