package com.smartbox.jobster.pojo.hh;

import java.util.List;

public class HHSyncSaveDTO {
    private List<HHSyncMappingDTO> mappings;

    public List<HHSyncMappingDTO> getMappings() { return mappings; }
    public void setMappings(List<HHSyncMappingDTO> mappings) { this.mappings = mappings; }

    public static class HHSyncMappingDTO {
        private String hhVacancyId;
        private String jobsterVacancyId;
        private String departmentId;
        private String positionId;
        private Integer qty;

        public String getHhVacancyId() { return hhVacancyId; }
        public void setHhVacancyId(String hhVacancyId) { this.hhVacancyId = hhVacancyId; }

        public String getJobsterVacancyId() { return jobsterVacancyId; }
        public void setJobsterVacancyId(String jobsterVacancyId) { this.jobsterVacancyId = jobsterVacancyId; }

        public String getDepartmentId() { return departmentId; }
        public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

        public String getPositionId() { return positionId; }
        public void setPositionId(String positionId) { this.positionId = positionId; }

        public Integer getQty() { return qty; }
        public void setQty(Integer qty) { this.qty = qty; }
    }
}
