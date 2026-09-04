package com.smartbox.jobster.controller;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.PositionService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.VacancyService;
import io.jmix.core.DataManager;
import io.jmix.core.EntitySerialization;
import io.jmix.core.EntitySerializationOption;
import io.jmix.core.entity.KeyValueEntity;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/extension")
@RequiredArgsConstructor
public class ExtensionController {
    private final VacancyService vacancyService;
    private final PositionService positionService;
    private final DepartmentService departmentService;
    private final EntitySerialization entitySerialization;
    private final TranslateService translateService;
    private final DataManager dataManager;

    @GetMapping("/vacancy/all")
    @ResponseBody
    public ResponseEntity<String> getVacancies(@RequestParam(required = false) String positionId,
                                               @RequestParam(required = false) String departmentId,
                                               @RequestParam(required = false) String responsibleId,
                                               @RequestParam(required = false) String applicantId,
                                               @RequestParam(required = false) String locale,
                                               @RequestParam String page) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String fixLocale(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/positions")
    public ResponseEntity<String> getPositions(
            @RequestParam(required = false, defaultValue = "0") Integer offset,
            @RequestParam(required = false, defaultValue = "20") Integer limit,
            @RequestParam(required = false) String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/references")
    @ResponseBody
    public ResponseEntity<String> getReferences() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
