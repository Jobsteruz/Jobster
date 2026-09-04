package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.FetchPlans;
import io.jmix.core.Messages;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@Service
public class OrgChartExcelService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private FetchPlans fetchPlans;
    @Autowired
    private Messages messages;

    public byte[] exportToExcel(Department rootDepartment) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void exportDepartment(Sheet sheet, Department department, int level, int[] currentRow,
                                  CellStyle departmentStyle, CellStyle staffingStyle, Workbook workbook) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CellStyle createLevelStyle(Workbook workbook, int level) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Department reloadDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private FetchPlan getDepartmentFetchPlan() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CellStyle createHeaderStyle(Workbook workbook) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CellStyle createDepartmentStyle(Workbook workbook) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CellStyle createStaffingStyle(Workbook workbook) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setBorders(CellStyle style) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
