package com.test.api.TestApi.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "employees")
public class Employee {

    private Long empNumber;
    private String name;
    private String role;

    public Employee(Long empNumber, String name, String role) {
        this.empNumber = empNumber;
        this.name = name;
        this.role = role;
    }

    public Employee(){


    }
    @Id
    @Column(name = "empNumber")
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }


    public void setName(String name) {

        this.name = name;
    }

    @Column(name = "role")
    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


}
