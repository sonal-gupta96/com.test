package com.spring.helloWorld.api.controller;


import com.spring.helloWorld.api.bean.response.EmployeeResponse;
import com.spring.helloWorld.api.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @Autowired
    EmployeeDetailService employeeDetailService;

    @GetMapping("/")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/employee/employeeDetails")
    public EmployeeResponse getEmployeeDetails() {
        return employeeDetailService.getEmployeeDetails();
    }
}
