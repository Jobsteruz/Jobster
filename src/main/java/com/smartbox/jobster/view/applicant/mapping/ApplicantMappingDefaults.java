package com.smartbox.jobster.view.applicant.mapping;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import lombok.Getter;
import lombok.Setter;

/**
 * User-picked defaults for the Applicant Excel-mapping flow.
 *
 * <p>The values here are applied <em>after</em> mapping the Excel cells, overriding the
 * mapped values for fields that the dialog claims unconditionally ({@code status},
 * {@code responsible}, {@code platform}, {@code category}, {@code vacancy}).
 *
 * <p>Region is intentionally NOT collected here — the Excel "Регион" column is mapped to
 * {@code Applicant.region} through the normal ParentRef get-or-create-by-name path, so
 * imported applicants pick up region from their source row instead of a single dialog default.
 *
 * <p>When {@link #vacancy} is selected, {@link #responsible} is sourced from the vacancy
 * itself (vacancy.responsible → Employee via employeeService) and the matching dialog field
 * is cleared in the UI.
 */
@Getter
@Setter
public class ApplicantMappingDefaults {

    /** Always applied. Overrides any "Добавлено из" mapping. */
    private Platform platform;

    /** Always applied. Excel "Статус" is intentionally ignored. */
    private PersonStatus status;

    /** Optional. When non-null, drives auto-population of responsible. */
    private Vacancy vacancy;

    /** Applied when {@link #vacancy} is null. Excel "Ответственный" is intentionally ignored. */
    private Employee responsible;

    /** Always applied. */
    private PersonCategory category;
}
