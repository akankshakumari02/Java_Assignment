package com.example.jpademo.JpaDemo;
import javax.persistence.*;

@Entity //to mark as Entity
@Table
public class Employee
{
    @Id //primary key
    private int id;
    private String name;
    private int age;
    private String location;


    public Employee() {
    }

    public Employee(int id, String name, int age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
