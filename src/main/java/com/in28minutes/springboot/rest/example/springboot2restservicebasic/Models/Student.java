package com.in28minutes.springboot.rest.example.springboot2restservicebasic.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// https://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate

@Entity // specifies the class is a JPA entity
public class Student {
    @Id // specifies the primary key of an entity
    @GeneratedValue // provides for the specification of generation strategies for the values of primary keys
    private Long id;
    private String name;
    private String passportNumber;

    public Student(){
        super();
    } // default constructor to make JPA happy

    public Student(Long id, String name, String passportNumber) {
        super();
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
