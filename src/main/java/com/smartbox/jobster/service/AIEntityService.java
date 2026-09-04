package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.ai.AIEntityLimit;
import io.jmix.core.DataManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AIEntityService {

    private final DataManager dataManager;


    public List<AIEntityLimit> getAllLimits() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
