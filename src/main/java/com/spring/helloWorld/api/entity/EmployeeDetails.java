package com.spring.helloWorld.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class EmployeeDetails extends AuditEntity {

    @Column(unique = true, name = "emp_code", columnDefinition = "nvarchar(max)")
    private String empCode;

    @Column(unique = true, name = "", columnDefinition = "nvarchar(max)")
    private String name;

    @Column(columnDefinition = "nvarchar(max)")
    private String city;

    @Column(columnDefinition = "nvarchar(max)")
    private String phoneNo;

    @Column(columnDefinition = "nvarchar(max)")
    private String gender;
}
