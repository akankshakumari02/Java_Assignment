package com.example.jpademo.JpaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController
{

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/retrieveemployee")
    public Iterable<Employee> get()
    {
       return employeeService.retrieveEmployee();
    }

    @PostMapping(path = "/saveemployee")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Employee user = employeeService.saveEmployee(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping(path = "/updateemployee")
    public void updateEmployeeDetail(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping(path = "/deleteemployee/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        employeeService.delete(id);
    }

    @GetMapping(path = "/totalemployee")
    public long list()
    {
       return employeeService.count();
    }

    @GetMapping(path = "/findbyname")
    public List<Employee> retrieveEmployeeByname(@RequestParam("Name") String name)
    {
        return employeeService.findEmployeeByName(name);
    }

    @GetMapping(path = "/findbynamelike")
    public List<Employee> retrieveEmployeeByNameWithA()
    {
        return employeeService.findEmployeeByNameStartingWithA();
    }

    @GetMapping(path = "/findbetweenage")
    public List<Employee> retrieveEmployeeBetweenAge(@RequestParam("Age1") int age1, @RequestParam("Age2") int age2)
    {
        return employeeService.findEmployeeBetweenAge(age1,age2);
    }

    @GetMapping("/pageandsort")
    public ResponseEntity<List<Employee>> getAllEmployees(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize,
            @RequestParam(defaultValue = "age") String sortBy)
    {
       List<Employee> list = employeeService.getAllEmployees(pageNo, pageSize, sortBy);

       return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
    }

}


