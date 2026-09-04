package com.smartbox.jobster.controller;

import java.util.UUID;

/**
 * DTO for position list response
 */
public record PositionListDTO(
        UUID id,
        String shortName
) {
}