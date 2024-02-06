package com.spring.helloWorld.api.repository;

import com.spring.helloWorld.api.entity.EmployeeDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, String> {

    EmployeeDetails findByEmpCode(@Param("emp_code") String empCode);
}
