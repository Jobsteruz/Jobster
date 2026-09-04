package com.smartbox.jobster.controller;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.config.VisionSettings;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.vision.Attendance;
import com.smartbox.jobster.entity.vision.UnknownFace;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 1/23/2024 9:38 AM
 */
@RestController
@RequestMapping("/api/vision")
public class VisionController {
    private static final Logger log = LoggerFactory.getLogger(VisionController.class);

    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityService entityService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private AppSettings appSettings;
    @Autowired
    private FileStorage fileStorage;

    @PostMapping("/checkin_checkout")
    public ResponseEntity<?> checkinCheckout(
            @RequestParam Integer type,
            @RequestParam UUID userId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime time,
            @RequestParam Float similarityScore,
            @RequestParam UUID branchId,
            @RequestParam Integer checkType
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/employees")
    public ResponseEntity<?> getEmployees(
            @RequestParam UUID branchId
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/branches")
    public ResponseEntity<?> getBranches() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/latest-app-version")
    public ResponseEntity<?> getLatestAppVersion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/latest-app-url")
    public ResponseEntity<?> getLatestAppUrl() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/latest-app")
    public ResponseEntity<?> getLatestApp() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostMapping("/unknown-face")
    public ResponseEntity<?> saveUnknownFace(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime time,
            @RequestParam MultipartFile photo
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
