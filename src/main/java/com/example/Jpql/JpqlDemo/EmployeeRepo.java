package com.example.Jpql.JpqlDemo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

    @Query("select e.firstName,e.lastName from Employee e where e.salary>(select avg(salary) from Employee) order by age ASC,salary DESC")
    List<Object[]> findAllEmployee();

    @Query("from Employee where firstName=:Name")
    List<Employee> findAllEmployeeByFirstName(@Param("Name") String firstName);


    @Query("Select AVG(salary) from Employee")
    int findAverageSalary();

    @Modifying
    @Query("update Employee e set e.salary=:salary where e.salary<:avgSalary")
    void updateBelowAvgEmpSalary(@Param("salary")double salary,@Param("avgSalary")double avgSalary);

    @Query("Select MIN(salary) from Employee")
    double findMinSalary();

    @Modifying
    @Query("Delete from Employee where salary=:minSalary")
    void deleteEmpMinSalary(@Param("minSalary")double minSalary);


    @Query(value = "SELECT empid,empfirstname,empage from employeetable WHERE emplastname = 'Singh'", nativeQuery = true)
    List<Object[]> findEmployeesWithLastName();

    @Modifying
    @Query(value = "DELETE from employeetable WHERE empage >:age", nativeQuery = true)
    void deleteEmployeeWithAge(@Param("age") int age);
}
