package com.example.jpademo.JpaDemo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//this will be Auto Implemented by the Spring as a bean called EmployeeRepository
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer>
{

    List<Employee> findByName(String name);

    List<Employee> findByNameLike(String s);

    List<Employee> findByAgeBetween(int age1, int age2);
}
