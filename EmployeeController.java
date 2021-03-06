package com.example.rest.webservices.RestfulServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public List<Employee> findAllEmployee()
    {
        return service.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee findOneEmployee(@PathVariable int id)
    {
        Employee emp = service.findOne(id);
        if(emp==null)
            throw new UserNotFoundException("id-"+id); //we are throwing exception to the UserNotFoundException class

        return emp;
    }

   /* @PostMapping("/employee")
    public void addEmployee(@Valid @RequestBody Employee employee ) {
        Employee newEmployee = service.save(employee);
    }*/

    @PostMapping("/employee")
    public ResponseEntity<Object> createEmployeeUser(@Valid @RequestBody Employee employee) {
        Employee employeeUser1 = service.save(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(employeeUser1.getId()).toUri();

        return ResponseEntity.created(location).build();
    }


   @DeleteMapping("/employee/{id}")
    public void deleteUser(@PathVariable int id) {
        Employee user = service.deleteById(id);
        if (user == null)
            //runtime exception
            throw new UserNotFoundException("id: " + id);
    }


    @PutMapping("/employee/{id}")
    public void updateEmployeeDetail(@RequestBody Employee employee,@PathVariable int id){
        service.updateEmployee(id,employee);
    }
}
