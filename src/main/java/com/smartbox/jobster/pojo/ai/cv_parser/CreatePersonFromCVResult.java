package com.smartbox.jobster.pojo.ai.cv_parser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePersonFromCVResult implements Serializable {

    @Serial
    private static final long serialVersionUID = 7920935398736108755L;
    private String username;
    private int total;
    private int success;
    private int fail;
    private List<String> failedFiles;
}
