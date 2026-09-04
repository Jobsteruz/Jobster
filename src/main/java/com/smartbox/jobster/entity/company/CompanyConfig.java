package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@JmixEntity
@Table(name = "JB_COMPANY_CONFIG", indexes = {
        @Index(name = "IDX_JB_COMPANY_CONFIG_COMPANY", columnList = "COMPANY_ID"),
        @Index(name = "IDX_JB_COMPANY_CONFIG_TEMPLATE", columnList = "TEMPLATE_ID"),
        @Index(name = "IDX_JB_COMPANY_CONFIG_APPROVER_ROLE_TYPE", columnList = "REQUEST_APPROVER_ROLE_TYPE_ID"),
        @Index(name = "IDX_JB_COMPANY_CONFIG_REQUEST_APPROVAL_CATEGORY", columnList = "REQUEST_APPROVAL_CATEGORY_ID")
})
@Entity(name = "jb_CompanyConfig")
@Getter
@Setter
public class CompanyConfig extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -8101483777578679718L;
    public static final String DEFAULT_FULL_NAME_FORMAT = "%f %l %m";

    @InstanceName
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @Column(name = "ENABLE2STEP")
    private Boolean enable2step = Boolean.FALSE;

    @Column(name = "DEFAULT2STEP")
    private String default2step = Platform.TELEGRAM.getId();

    @Column(name = "TEMPLATE2STEP")
    private String template2step;

    @Column(name = "FULL_NAME_FORMAT")
    private String fullNameFormat;

    @Column(name = "AI_CALL_WELCOME_TEXT", length = 500)
    private String aiCallWelcomeText;

    @Column(name = "AI_CALL_GOODBYE_TEXT", length = 500)
    private String aiCallGoodbyeText;

    @Column(name = "OFFER_POSITION_ON_REJECT")
    private Boolean offerPositionOnReject = Boolean.FALSE;

    @Column(name = "SELECT_VACANCY_ON_MESSAGE")
    private Boolean selectVacancyOnMessage = Boolean.FALSE;

    @Column(name = "AUTO_CREATE_VACANCY_ON_APPROVE")
    private Boolean autoCreateVacancyOnApprove = Boolean.FALSE;

    @Column(name = "CREATE_BRANCH_ON_CLONE")
    private Boolean createBranchOnClone = Boolean.FALSE;

    @JoinTable(name = "JB_COMPANY_CONFIG_DEPARTMENT_CATEGORY_LINK",
            joinColumns = @JoinColumn(name = "COMPANY_CONFIG_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_CATEGORY_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<DepartmentCategory> autoCreateVacancyOnCategories;

    @Column(name = "TWO_STEP_REQUEST_APPROVAL")
    private Boolean twoStepRequestApproval = Boolean.FALSE;

    @JoinColumn(name = "REQUEST_APPROVER_ROLE_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleType requestApproverRoleType;

    @OnDelete(DeletePolicy.CASCADE)
    @JoinColumn(name = "REQUEST_APPROVAL_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DepartmentCategory requestApprovalCategory;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate template;

    @Column(name = "PLATFORMS")
    private String platforms;

    @Column(name = "NOTIFY_RESP")
    private Boolean notifyResp = Boolean.FALSE;

    @Column(name = "ADDITIONAL_QUESTIONS_J3")
    private Boolean additionalQuestionsJ3 = Boolean.FALSE;

    public Boolean getNotifyResp() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getAdditionalQuestionsJ3() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getFullNameFormat() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getEnable2step() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Set<Platform> getDefault2step() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDefault2step(Set<Platform> default2step) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getOfferPositionOnReject() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getSelectVacancyOnMessage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getAutoCreateVacancyOnApprove() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getCreateBranchOnClone() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getTwoStepRequestApproval() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Set<Platform> getPlatforms() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatforms(Set<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}