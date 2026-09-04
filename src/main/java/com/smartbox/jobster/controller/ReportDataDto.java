package com.smartbox.jobster.controller;

import java.util.List;

public record ReportDataDto<T>(String columnName, List<T> data) {
}