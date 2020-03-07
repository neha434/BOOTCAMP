package com.example.RestService.assignment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//Q.6) Implement Exception Handling for resource not found
@ResponseStatus(HttpStatus.NOT_FOUND)

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message) {
            super(message);
        }
    }
