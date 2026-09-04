package com.smartbox.jobster.service.clone;

import com.smartbox.jobster.service.clone.service.*;

/**
 * @author Jobster team
 * Since: 7/7/2024 11:43 AM
 */
public interface CloneBuilder {

    static CloneBuilder build(CloneContext context, Clone clone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    void cloning();
}
