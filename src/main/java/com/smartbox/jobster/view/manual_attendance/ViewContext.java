package com.smartbox.jobster.view.manual_attendance;


import java.time.LocalDate;

/**
 * @author Jobster team
 * date: 14/08/24 10:30
 */

public record ViewContext(String columnDateFormat,
                          LocalDate startAttendDate, LocalDate endAttendDate,
                          String defaultBranchCode) {

}