package com.example.hibernate.componentmapping.ComponentMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/saveemployee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

}
