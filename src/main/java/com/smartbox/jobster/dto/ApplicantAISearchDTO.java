package com.smartbox.jobster.dto;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApplicantAISearchDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -6006991544929441537L;

    private String position;
    private String department;
    private String responsible;
    private String education;
    private String experience;
    private String salaryFrom;
    private String salaryTo;
    private String workSchedule;
    private String platform;
    private String source;
    private String employeeOrNot;
    @InstanceName
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private String birthDate;
    private String gender;
    private String address;
    private String address2;
    private String postalCode;
    private String latitude;
    private String longitude;
    private String email;
    private String phone;
    private String phone2;
    private String group;
    private String offeredPositon;
    private String category;
    private String status;
    private String country;
    private String region;
    private String maritalStatus;
    private String numOfChildren;
    private String memo;
    private String about;
    private String score;
    private String favorite;
    private String questionnaire;
    private String fillDate;
    private String code;
    private String tenantId;
    private String id;
}