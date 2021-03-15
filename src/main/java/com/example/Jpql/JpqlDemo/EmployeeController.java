package com.example.Jpql.JpqlDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employee")
    public Iterable<Employee> get() {
        return employeeService.retrieveEmployee();
    }

    @PostMapping(path = "/employee")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Employee user = employeeService.saveEmployee(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(path = "/getallemployee")
    public List<Object[]> retriveAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping(path = "/findbyname")
    public List<Employee> retrieveEmployeeByname(@RequestParam("Name") String name)
    {
        return employeeService.findEmployeeByName(name);
    }

    @PutMapping(path = "/updateemployee")
    public void updateEmployeeDetail(@RequestParam("salary") double salary){
        employeeService.updateSalary(salary);
    }

    @DeleteMapping(path = "/deleteempmin")
    public void deleteEmp()
    {
        employeeService.deleteEmployeeMinSalary();
    }

    @GetMapping(path = "/findbylastname")
    public List<Object[]> retrieveEmployeeByname()
    {
       return employeeService.findEmployeeByLastName();
    }

    @DeleteMapping(path = "/deletebyage")
    public void retrieveEmployeeByname(@RequestParam("Age") int age)
    {
         employeeService.deleteEmployee(age);
    }
}