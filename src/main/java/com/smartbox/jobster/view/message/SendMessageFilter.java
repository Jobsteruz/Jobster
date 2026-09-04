package com.smartbox.jobster.view.message;

import com.smartbox.jobster.entity.ref.Region;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public record SendMessageFilter(List<Region> regions, Set<UUID> bots, Boolean onlyNotApplicant,
                                Boolean onlyRejectedApplicant, Boolean onlyReservedApplicant, Boolean alsoBlockedUser,
                                Boolean alsoEmployee, Boolean onlyEmployees) {
}
