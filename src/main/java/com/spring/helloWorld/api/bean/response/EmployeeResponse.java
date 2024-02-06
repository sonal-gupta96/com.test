package com.spring.helloWorld.api.bean.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {

    private Integer id;
    private String empCode;
    private String name;
    private String city;
    private String phoneNo;
    private String gender;
}
