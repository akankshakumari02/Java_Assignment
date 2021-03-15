package com.example.Jpql.JpqlDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> retrieveEmployee() {
        return employeeRepository.findAll();
    }

    public List<Object[]> getAllEmployee(){
        return employeeRepository.findAllEmployee();
    }

    public List<Employee> findEmployeeByName(String name)
    {
        return employeeRepository.findAllEmployeeByFirstName(name);
    }

    @Transactional
    public void updateSalary(double salary)
    {
        double avgSalary=employeeRepository.findAverageSalary();

        employeeRepository.updateBelowAvgEmpSalary(salary,avgSalary);
    }

    @Transactional
    public void deleteEmployeeMinSalary()
    {
        double minSalary= employeeRepository.findMinSalary();

        employeeRepository.deleteEmpMinSalary(minSalary);
    }

    public List<Object[]> findEmployeeByLastName()
    {
        return employeeRepository.findEmployeesWithLastName();
    }

    @Transactional
    public void deleteEmployee(int age)
    {
        employeeRepository.deleteEmployeeWithAge(age);
    }
}