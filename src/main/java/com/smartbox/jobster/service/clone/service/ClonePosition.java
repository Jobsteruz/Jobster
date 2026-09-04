package com.smartbox.jobster.service.clone.service;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.service.PositionService;
import com.smartbox.jobster.service.clone.CloneBuilder;
import com.smartbox.jobster.service.clone.CloneContext;
import io.jmix.core.SaveContext;

import java.util.List;

/**
 * @author Jobster team
 * Since: 7/9/2024 1:42 AM
 */
public class ClonePosition extends AbstractCloning implements CloneBuilder {
    PositionService positionService;

    public ClonePosition(CloneContext cloneContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void cloning() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
