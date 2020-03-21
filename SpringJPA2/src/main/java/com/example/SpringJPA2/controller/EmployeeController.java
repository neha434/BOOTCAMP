package com.example.SpringJPA2.controller;


import com.example.SpringJPA2.module.Employee;
import com.example.SpringJPA2.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController
{

    @Autowired
    EmployeeRepository repository;
    List<Object[]> list;
    @GetMapping("/create")
    public void testCreateEmployee()
    {
        Employee emp = new Employee();
        emp.setFirstName("Raj");
        emp.setLastName("Mishra");
        emp.setSalary(30000);
        emp.setAge(28);
        repository.save(emp);
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setFirstName("Rashi");
        emp2.setLastName("Singh");
        emp2.setSalary(36000);
        emp2.setAge(32);
        repository.save(emp2);
        Employee emp3 = new Employee();
        emp3.setId(3);
        emp3.setFirstName("Pragati");
        emp3.setLastName("Sighal");
        emp3.setSalary(48000);
        emp3.setAge(50);
        repository.save(emp3);
        Employee emp4 = new Employee();
        emp4.setId(4);
        emp4.setFirstName("Vikram");
        emp4.setLastName("Sigh");
        emp4.setSalary(58000);
        emp4.setAge(55);
        repository.save(emp4);
        Employee emp5 = new Employee();
        emp5.setId(5);
        emp5.setFirstName("Manoj");
        emp5.setLastName("Sharma");
        emp5.setSalary(45000);
        emp5.setAge(53);
        repository.save(emp5);

    }



    //1. Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @GetMapping("/jpql1")
    public List<Object[]> showDetails() {
        Sort sort = Sort.by(Sort.Order.asc("age"), Sort.Order.desc("salary"));
        List<Object[]> objects = repository.partialSelect(PageRequest.of(0, 2, sort));
        for (Object[] objects1 : objects) {
            System.out.print(objects1[0] + " ");
            System.out.print(objects1[1] + " ");
            System.out.println();
        }
        return objects;
    }
    //2. Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @GetMapping("/jpql2")
    public void updateSalary()
    {
        repository.updateSalary(10000,repository.avgSalary());
    }

    //3. Delete all employees with minimum salary.
    @GetMapping("/jpql3")
    public void deleteSalary()
    {
        repository.deleteSalary(repository.minSalary());
    }

    //1. Display the id, first name, age of all employees where last name ends with "singh"

    @GetMapping("/native1")
    public void findSingh(){
        List<Object[]> objects=repository.findSingh();
        for (Object[] objects1 : objects) {
            System.out.print("id: "+objects1[0] + " name: "+objects1[1] + " age: "+objects1[2]);
            System.out.println();
        }
    }
    //2. Delete all employees with age greater than 45(Should be passed as a parameter)

    @GetMapping("/native2")
    public void deleteOld()
    {
        repository.deleteOld(45);
    }




}