package com.in28minutes.springboot.rest.example.springboot2restservicebasic.Controllers;

public class StudentNotFoundException extends Throwable {
    public StudentNotFoundException(String exception) {
        super(exception);
    }
}
