package com.smartbox.jobster.service.attendance;

import java.time.OffsetDateTime;
import java.util.List;

public record AttendanceOneDayDTO(OffsetDateTime date,
                                  String hours,
                                  List<AttendanceDTO> attendances) {
}