package com.test.api.TestApi.controller;

import com.test.api.TestApi.exception.ResourceNotFoundException;
import com.test.api.TestApi.model.Employee;
import com.test.api.TestApi.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeeDetails")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping(value ={"/getDetails"})
    public ResponseEntity<Employee> getEmployeeDetails(@RequestParam(value = "empid") Long id ) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
        logger.info("Logging using App insights for employee",id);
        return ResponseEntity.ok().body(employee);
    }

}
