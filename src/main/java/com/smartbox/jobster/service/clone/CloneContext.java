package com.smartbox.jobster.service.clone;

import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import io.jmix.core.Metadata;
import io.jmix.core.MetadataTools;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Jobster team
 * Since: 7/7/2024 11:56 AM
 */
@Getter
@Setter
public class CloneContext {
    //attributes
    private Company company;
    private Company cloneCompany;

    //services
    private Metadata metadata;
    private MetadataTools metadataTools;
    private EntityService entityService;
    private CloneService cloneService;
    private TranslateService translateService;

    private CloneContext(Company company, Company cloneCompany) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static CloneContext create(Company company, Company cloneCompany) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CloneBuilder findBuilder(Clone clone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getTenant() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getClonedTenant() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
