package com.example.Rest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoServices{
    private static List<Employee> emp = new ArrayList<>();
    private static int idCounter= 4;
    static {
        emp.add(new Employee(1,"Raj Verma",new Date()));
        emp.add(new Employee(2,"Riya Sharma",new Date()));
        emp.add(new Employee(3,"Keshav Mishra",new Date()));
        emp.add(new Employee(4,"Pragati Mehra",new Date()));
    }

    public List<Employee> findAll()
    {
        return emp;
    }

    public Employee addEmployee(Employee emp1){
        if(emp1.getId() == null){
            emp1.setId(++idCounter);
        }
        emp.add(emp1);
        return emp1;
    }
    public Employee deleteEmployeeByID(int id){
        Iterator<Employee> itr = emp.iterator();
        while(itr.hasNext()){
            Employee emp = itr.next();
            if(emp.getId() == id){
                itr.remove();
                return emp;
            }
        }
        return null;
    }

}
