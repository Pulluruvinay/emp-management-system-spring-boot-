
package com.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity //specify the connection to the relation database...
public class Employee {

    @Id  // specify the primary key..
    @GeneratedValue(strategy = GenerationType.IDENTITY) // specify the auto-generated value for the id...
    private long id;

    private String name;

    private String email;

    private String age;

    private String designation;


    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // To String Method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
