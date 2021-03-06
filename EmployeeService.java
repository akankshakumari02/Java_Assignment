package com.example.rest.webservices.RestfulServices;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** we want this class to be managed by the Spring
 * this will provide services to our Employee class */
@Service
public class EmployeeService
{
    private static int count = 4;
    private static List<Employee> employee = new ArrayList<>();

static
{
    employee.add(new Employee(1,"Akanksha",23));
    employee.add(new Employee(2,"Ayush",25));
    employee.add(new Employee(3,"Kanika",22));
    employee.add(new Employee(4,"Rohan",24));
}

//finding all employees

    public List<Employee> findAll()
    {
        return employee;
    }

    //to save employee
    public Employee save(Employee e)
    {
        if(e.getId() == 0)
        {
            e.setId(++count);
        }
        employee.add(e);
        return e;
    }

    //to find one employee

    public Employee findOne(int id)
    {
        for(Employee emp : employee)
        {
            if(emp.getId() == id)
            {
                return emp;
            }
        }
        return null;
    }


    //to delete an employee

    public Employee deleteById(int id)
    {
        Iterator<Employee> iterator = employee.iterator();
        while(iterator.hasNext())
        {
            Employee emp=iterator.next();
            if(emp.getId()==id)
            {
                iterator.remove();
                return emp;
            }
        }
        return null;
    }

    //update user
    public void updateEmployee(int id, Employee e) {
    for(int i=0; i<employee.size(); i++)
        {
            Employee emp = employee.get(i);
            if(emp.getId() == id)
            {
                employee.set(i, e);
                return;
            }
        }

    }
}
