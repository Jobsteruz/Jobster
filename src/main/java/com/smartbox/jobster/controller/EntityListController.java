package com.smartbox.jobster.controller;


import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.kanban.Kanban;
import io.jmix.core.DataManager;
import io.jmix.core.EntitySerialization;
import io.jmix.core.FetchPlan;
import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/landing-page/all")
@RequiredArgsConstructor
public class EntityListController {

    private final DataManager dataManager;
    private final EntitySerialization entitySerialization;


    @GetMapping("/applicant-kanbans")
    public ResponseEntity<String> getAllApplicantKanbans() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/roleTypes")
    public ResponseEntity<String> getAllRoleTypes() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
