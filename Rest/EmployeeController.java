package com.example.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDaoServices employeeDaoServices;
    @Autowired
    private MessageSource messageSource;

    // Internationalization

    @GetMapping(path = "/helloTTN")
    public String helloWorldInternationalisation(){
        return messageSource.getMessage("good-morning",null, LocaleContextHolder.getLocale());
    }
    @GetMapping("/helloTTN/{username}")
    public String returnHelloUserName(@PathVariable  String username){
        return "Hello"+username;
    }

    // Content Negotiation

    @GetMapping("/getEmployees")
    public List<Employee> getAllEmployees(){
        return employeeDaoServices.findAll();
    }
    @PostMapping("/addEmployee")
    public void addNewEmployee(@RequestBody Employee emp){
        Employee employee = employeeDaoServices.addEmployee(emp);
    }
    @DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id){
        Employee emp = employeeDaoServices.deleteEmployeeByID(id);

        if(emp == null){
            throw  new EmployeeNotFoundException("id"+id);
        }
    }

}
