package com.smartbox.jobster.service.restservices.request;

import java.util.UUID;

public record PositionDTO(String name, String shortName, String responsibility, UUID ishgoPosition, UUID hhProfession) {
}
