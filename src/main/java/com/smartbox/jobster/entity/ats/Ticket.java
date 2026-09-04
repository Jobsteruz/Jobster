package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_TICKET")
@Entity(name = "jb_Ticket")
@Getter
@Setter
public class Ticket extends StandardTenantEntity {

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    @InstanceName
    @Column(name = "EXCEPTION_CLASS")
    private String exceptionClass;

    @Column(name = "EXCEPTION_")
    @Lob
    private String exception;

    @Column(name = "DATE_")
    private OffsetDateTime date;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "SOURCE", length = 20)
    private String source;

    @JmixProperty
    public TicketStatus getTicketStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @JmixProperty
    public TicketSource getTicketSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setTicketSource(TicketSource ticketSource) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}