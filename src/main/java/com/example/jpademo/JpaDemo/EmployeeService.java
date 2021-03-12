package com.example.jpademo.JpaDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> retrieveEmployee()
    {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);

    }


    public String delete(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent())
        {
            employeeRepository.delete(employee.get());
            return "Employee is deleted with id"+id;
        }
        else
            throw new RuntimeException("Employee not found for the id"+id);
    }

    public long count()
    {
        return employeeRepository.count();
    }

    public List<Employee> findEmployeeByName(String name)
    {
        return employeeRepository.findByName(name);
    }

    public List<Employee> findEmployeeByNameStartingWithA()
    {
        return employeeRepository.findByNameLike("A%");
    }

    public List<Employee> findEmployeeBetweenAge(int age1, int age2)
    {
        return employeeRepository.findByAgeBetween(age1,age2);
    }

    public List<Employee> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Employee> pagedResult = employeeRepository.findAll(paging);
         return pagedResult.getContent();
    }
}


