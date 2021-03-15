package com.example.Jpql.JpqlDemo;

import javax.persistence.*;

@Entity
@Table(name = "employeetable")
public class Employee
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "empid")
    private int id;

    @Column(name = "empfirstname ")
    private String firstName;

    @Column(name = "emplastname")
    private String lastName;

    @Column(name = "empage")
    private int age;

    @Column(name = "empsalary")
    private double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
