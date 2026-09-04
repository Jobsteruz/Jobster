package com.smartbox.jobster.service.restservices.department;

import java.util.UUID;

public record DepartmentDTO(String name,String shortName,UUID parentId,UUID branchType,UUID departmentCategory,UUID personCategory,
                            String address, String phone, String email,String location,UUID regionId) {
}
