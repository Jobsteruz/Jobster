package com.smartbox.jobster.service.restservices.department;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.EmploymentType;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.FetchPlan;
import io.jmix.rest.annotation.RestHttpMethod;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@RestService("api_departmentService")
@RequiredArgsConstructor
public class RestDepartmentService {
    private final EntityService entityService;

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<List<Department>> getDepartments() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<UUID> createDepartment(DepartmentDTO department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<UUID> createStaffingTable(StaffingTableDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
