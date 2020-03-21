package com.example.SpringJPA2.controller;

import com.example.SpringJPA2.module.EmployeeEmbedded;
import com.example.SpringJPA2.module.Salary;
import com.example.SpringJPA2.repos.EmbeddedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Component Mapping:
Implement and demonstrate Embedded mapping using employee table having following fields: id, firstName,
 lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.*/
@RestController
public class EmbeddedController {
    @Autowired
    EmbeddedRepository repository;


    @GetMapping("/embeddedMaping")
    void embedd(){
        Salary salary=new Salary();
        salary.setBasicSalary(15000);
        salary.setBonusSalary(2000);
        salary.setSpecialAllowanceSalary(1890);
        salary.setTaxAmount(2000);
        EmployeeEmbedded employeeEmbedded=new EmployeeEmbedded();
        employeeEmbedded.setFirstName("Neha");
        employeeEmbedded.setLastName("Rai");
        employeeEmbedded.setAge(23);
        employeeEmbedded.setSalary(salary);
        repository.save(employeeEmbedded);

    }

}
