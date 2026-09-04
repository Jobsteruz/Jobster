package com.smartbox.jobster.entity.core;

import com.google.common.base.Strings;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.*;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@JmixEntity(name = "jb_Person")
@MappedSuperclass
@Getter
@Setter
public abstract class Person extends StandardQuestionnaireEntity implements Serializable {
    private static final long serialVersionUID = 4058924409956735491L;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Column(name = "LAST_NAME")
    protected String lastName;

    @Column(name = "MIDDLE_NAME")
    protected String middleName;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "BIRTH_DATE")
    protected OffsetDateTime birthDate;

    @Column(name = "PHOTO", length = 1024)
    protected FileRef photo;

    @Column(name = "GENDER")
    protected String gender;

    @Column(name = "ADDRESS")
    @Lob
    protected String address;

    @Column(name = "ADDRESS2")
    @Lob
    private String address2;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @NumberFormat(pattern = "##0.################", decimalSeparator = ".")
    @Column(name = "LATITUDE", precision = 22, scale = 18)
    private BigDecimal latitude;

    @NumberFormat(pattern = "##0.################", decimalSeparator = ".")
    @Column(name = "LONGITUDE", precision = 22, scale = 18)
    private BigDecimal longitude;

    @Column(name = "EMAIL")
    protected String email;

    @Column(name = "PHONE")
    protected String phone;

    @Column(name = "PHONE2")
    protected String phone2;

    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonGroup group;

    @JoinColumn(name = "CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonCategory category;

    @Column(name = "STATUS")
    private String status = PersonStatus.NEW.getId();

    @JoinColumn(name = "COUNTRY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    @JoinColumn(name = "REGION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Region region;

    @JoinColumn(name = "MARITAL_STATUS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MaritalStatus maritalStatus;

    @Column(name = "NUM_OF_CHILDREN")
    private Integer numOfChildren;

    @Column(name = "MEMO")
    @Lob
    private String memo;

    @Column(name = "SCORE")
    private Double score;

    @Column(name = "FAVORITE")
    private Boolean favorite;

    public void setPhone(String phone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPhone2(String phone2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public PersonStatus getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus(PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Gender getGender() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setGender(Gender gender) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getFullName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"firstName", "lastName", "middleName", "fullName", "email", "tenantId"})
    public String getDisplayName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String formatFullName(String firstName, String lastName, String middleName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String formatUsername() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @JmixProperty
    @DependsOnProperties({"birthDate"})
    public Integer getAge() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @JmixProperty
    public String getLanguage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Virtual (non-persistent) marker property used so that the department hierarchy can be
     * selected as a card field in the Kanban template editor (TwinColGrid), exactly like the
     * computed "age"/"language" properties. The actual value shown on the card is rendered by
     * PersonCard via DepartmentService.getRootedDepartmentNames(), so this getter intentionally
     * returns null and is skipped in JPQL projections (KanbanService.joinProperties).
     */
    @JmixProperty
    public String getDepartmentHierarchy() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getIshGoLocale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
