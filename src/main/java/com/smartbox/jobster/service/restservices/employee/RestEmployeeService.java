package com.smartbox.jobster.service.restservices.employee;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireEntityLabel;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.FluentLoader;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.rest.annotation.RestHttpMethod;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;


@RestService("api_EmployeeService")
@RequiredArgsConstructor
public class RestEmployeeService {
    private final EntityService entityService;
    private final DataManager dataManager;
    private final EmployeeService employeeService;
    private final QueryTransformerFactory queryTransformerFactory;


    @RestMethod
    public ResponseEntity<List<Employee>> getAll(AllEmployeeFilterDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<Employee> getCurrentEmployee() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod
    public ResponseEntity<EmployeeInfoResDTO> getEmployeeInfo(UUID employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
