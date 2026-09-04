package com.smartbox.jobster.controller;

import com.smartbox.jobster.dto.KanbanDTO;
import com.smartbox.jobster.service.IntegrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class IntegrationController {
    private final IntegrationService integrationService;

    @GetMapping("/kanbans")
    public ResponseEntity<List<KanbanDTO>> getAllKanbanWithStages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/integration/newEmployees")
    public ResponseEntity<String> newEmployees(@RequestParam("from") @DateTimeFormat(pattern = "dd-MM-yyyy") Date from,
                                               @RequestParam("to") @DateTimeFormat(pattern = "dd-MM-yyyy") Date to,
                                               @RequestParam boolean sanitize) throws IOException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
