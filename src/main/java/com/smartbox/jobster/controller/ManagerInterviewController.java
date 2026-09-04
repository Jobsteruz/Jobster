package com.smartbox.jobster.controller;

import com.smartbox.jobster.dto.*;
import com.smartbox.jobster.service.ManagerInterviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interview")
@RequiredArgsConstructor
public class ManagerInterviewController {

    private final ManagerInterviewService interviewService;

    @GetMapping("/questionnaires")
    public ResponseEntity<ApiResponse<List<QuestionnaireDTO>>> getQuestionnaires(@RequestParam String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostMapping("/start")
    public ResponseEntity<ApiResponse<InterviewResponse>> startInterview(@Valid @RequestBody StartInterviewRequest request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostMapping("/save/{interviewId}")
    public ResponseEntity<ApiResponse<String>> saveAnswers(@PathVariable String interviewId,
                                                           @Valid @RequestBody InterviewRequest request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/result/{interviewId}")
    public ResponseEntity<ApiResponse<InterviewResultDTO>> getInterviewResults(@PathVariable String interviewId,
                                                                               @RequestParam String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/results/{applicantId}")
    public ResponseEntity<ApiResponse<List<InterviewResultDTO>>> getInterviewResultByApplicant(@PathVariable String applicantId,
                                                                                               @RequestParam String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/result/detail/{interviewId}")
    public ResponseEntity<ApiResponse<List<InterviewResultDetailDTO>>> getInterviewDetailResult(@PathVariable String interviewId,
                                                                                                @RequestParam String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
