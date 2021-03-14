package com.example.hibernate.componentmapping.ComponentMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) {
         employeeRepository.save(employee);
    }

}
