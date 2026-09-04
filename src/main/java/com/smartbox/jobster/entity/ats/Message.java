package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@JmixEntity
@Table(name = "JB_MESSAGE")
@Entity(name = "jb_Message")
@Getter
@Setter
public class Message extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 5581446925034952615L;

    @JoinTable(name = "JB_MESSAGE_VACANCY_LINK",
            joinColumns = @JoinColumn(name = "MESSAGE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "VACANCY_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Vacancy> vacancies;

    @JoinTable(name = "JB_MESSAGE_REGION_LINK",
            joinColumns = @JoinColumn(name = "MESSAGE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "REGION_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Region> regions;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

    @Column(name = "FILE_ID", length = 512)
    private String fileId;

    @Column(name = "MESSAGE")
    @Lob
    private String message;

    @Column(name = "DATE_")
    private LocalDateTime date;

    @Column(name = "ALSO_BLOCKED")
    private Boolean alsoBlocked;

    @Column(name = "ALSO_EMPLOYEE")
    private Boolean alsoEmployee;

    @Column(name = "ONLY_NOT_APPLICANT")
    private Boolean onlyNotApplicant;

    @Column(name = "ONLY_REJECTED")
    private Boolean onlyRejected;

    @Column(name = "ONLY_RESERVED")
    private Boolean onlyReserved;

    @Column(name = "ONLY_EMPLOYEES")
    private Boolean onlyEmployees;

    @Column(name = "COUNT_")
    private String counts;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "message")
    private List<MessageKeyboard> keyboards;

    @Column(name = "PLATFORMS")
    private String platforms;

    @Column(name = "BOTS", length = 1024)
    private String bots;

    @Column(name = "SENT")
    private Boolean sent = Boolean.FALSE;

    @Column(name = "SENT_COMPLETED_DATE")
    private LocalDateTime sentCompletedDate;

    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
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

    public Set<UUID> getBots() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setBots(Set<UUID> bots) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setCountsMap(Integer count, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Map<String, String> getCountsMap() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getCount(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}