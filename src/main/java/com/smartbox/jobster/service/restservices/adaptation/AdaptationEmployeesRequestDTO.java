package com.smartbox.jobster.service.restservices.adaptation;

import java.util.UUID;

public record AdaptationEmployeesRequestDTO(UUID kanban, Integer offset, Integer limit, String search,
                                            String sortBy, String sortDirection, String locale,
                                            AdaptationEmployeeFilterDTO filter) {
}
