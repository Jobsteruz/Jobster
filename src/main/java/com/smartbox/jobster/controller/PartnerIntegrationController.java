package com.smartbox.jobster.controller;

import com.smartbox.jobster.service.PartnerIntegrationService;
import com.smartbox.jobster.service.restservices.partnerintegration.*;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PartnerIntegrationController {

    private static final Logger log = LoggerFactory.getLogger(PartnerIntegrationController.class);


    private final PartnerIntegrationService partnerintegrationService;

    @PostMapping("/position/save")
    public ResponseEntity<String> savePosition(@RequestBody PositionDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostMapping("/department/save")
    public ResponseEntity<String> saveDepartment(@RequestBody DepartmentDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostMapping("/legal-company/save")
    public ResponseEntity<String> saveLegalCompany(@RequestBody LegalCompanyDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostMapping("/staff-plan/save")
    public ResponseEntity<String> saveStaffPlan(@RequestBody StaffingTableDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostMapping("/employee/save")
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/departments")
    public ResponseEntity<?> getDepartments(@RequestParam(required = false) String platformId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/positions")
    public ResponseEntity<?> getPositions(@RequestParam(required = false) String platformId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/legal-companies")
    public ResponseEntity<?> getLegalCompanies(@RequestParam(required = false) String platformId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/staff-plans")
    public ResponseEntity<?> getStaffingTables(@RequestParam(required = false) String platformId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/employees")
    public ResponseEntity<?> getEmployees(@RequestParam(required = false) String platformId,
                                          @RequestParam(required = false) LocalDate from,
                                          @RequestParam(required = false) LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/applicants")
    public ResponseEntity<?> getApplicants(@RequestParam(required = false) String pinfl,
                                           @RequestParam(required = false)  LocalDate from,
                                           @RequestParam(required = false)  LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
