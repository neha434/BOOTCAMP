package com.example.RestService.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDaoService userDaoService;

// Q.3) Implement GET http request for Employee to get list of employees.
    @GetMapping("/employee/all")
    public List<Employee> getAllUser() {
        return userDaoService.findAll();

    }

    // Q.4) Implement GET http request using path variable top get one employee
    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable int id) {
        return userDaoService.findOne(id);
    }

    //Q.5) Implement POST http request for Employee to create a new employee.
    @PostMapping("/employeePost")
    public Employee insertUser(@RequestBody Employee user)
    {
        userDaoService.saveEmployee(user);
        return user;
    }

    //Q.6) Implement Exception Handling for resource not found
    @GetMapping("/ans6/{id}")
    public Employee getEmployeeByValidId(@PathVariable int id){
        Employee emp = userDaoService.findOne(id);
        if(emp==null){
            throw new EmployeeNotFoundException("Id"+id);
        }
        return emp;
    }
    //Q.7) Implement DELETE http request for Employee to delete employee
    @DeleteMapping("/ans7/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        Employee emp= userDaoService.deleteEmployeeById(id);
        if(emp==null){
            throw new EmployeeNotFoundException("id:"+id);
        }

    }

    //Q.8) Implement PUT http request for Employee to update employee
    @PutMapping("update/{id}")
    public void update(@PathVariable int id, @RequestBody Employee emp)
    {
        userDaoService.update(id,emp);
    }

    // Q.9) Apply validation while create a new employee using POST http Request.
    @PostMapping("/ans9/validation")
    public ResponseEntity<Object>createEmployee(@Valid @RequestBody Employee emp){
        Employee savedEmployee= userDaoService.saveEmployee(emp);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(savedEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
