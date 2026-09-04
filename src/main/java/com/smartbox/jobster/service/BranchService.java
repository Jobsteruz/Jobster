package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.company.Branch;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.Metadata;
import io.jmix.core.MetadataTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Branch (filial) entity uchun xizmat.
 */
@Service
public class BranchService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private Metadata metadata;
    @Autowired
    private MetadataTools metadataTools;
    @Autowired
    private GenCodeService genCodeService;

    /**
     * Filialni (Branch) klonlaydi.
     * region / category / department bog'lanishlari saqlanib, yangi id va code bilan
     * yangi Branch yaratiladi. Shu tariqa klon branch ro'yxatiga qo'shiladi va darhol ko'rinadi.
     */
    @Transactional
    public Branch cloneBranch(Branch source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
