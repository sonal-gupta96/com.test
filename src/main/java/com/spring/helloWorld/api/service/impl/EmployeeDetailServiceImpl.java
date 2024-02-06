package com.spring.helloWorld.api.service.impl;


import com.spring.helloWorld.api.bean.response.EmployeeResponse;
import com.spring.helloWorld.api.entity.EmployeeDetails;
import com.spring.helloWorld.api.repository.EmployeeRepository;
import com.spring.helloWorld.api.service.EmployeeDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public EmployeeResponse getEmployeeDetails() {
        EmployeeDetails employeeDetails = new EmployeeDetails("EMP001","Test","Noida","9189423411","Male");
        employeeRepository.save(employeeDetails);
        EmployeeResponse employeeResponse = new EmployeeResponse();

        EmployeeDetails employeeDetails1 = employeeRepository.findByEmpCode(employeeDetails.getEmpCode());
        if(employeeDetails1!= null) {
            employeeResponse.setId(employeeDetails1.getId());
            employeeResponse.setEmpCode(employeeDetails1.getEmpCode());
            employeeResponse.setName(employeeDetails1.getName());
            employeeResponse.setCity(employeeDetails1.getCity());
            employeeResponse.setPhoneNo(employeeDetails1.getPhoneNo());
            employeeResponse.setGender(employeeDetails1.getGender());
        }
        return employeeResponse;
    }
}
