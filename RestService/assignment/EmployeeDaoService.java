package com.example.RestService.assignment;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Component
//Q.2) Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.

public class EmployeeDaoService {
    private static List<Employee> emp= new ArrayList<>();
    private static int usercount=3;
    static{
        emp.add(new Employee ("Neho" , 1, "Greater Noida"));
        emp.add(new Employee("Pragati" , 2, "Noida"));
        emp.add(new Employee("Ajay" , 3, "Delhi")); }
    public List <Employee> findAll()
    { return  emp;
    }
    public Employee saveEmployee (Employee user){
        if(user.getId()==null){
                user.setId(++usercount); }
            emp.add(user);
            return user;
        }
        public Employee findOne(Integer id){
            for(Employee user: emp)
            {
                if(user.getId()==id)
                    return user;
            }
            return null; }

    //Q.7) Implement DELETE http request for Employee to delete employee
    public Employee deleteEmployeeById(int id) {
        Iterator<Employee> iterator = emp.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == id) {
                iterator.remove();
                return emp;
            }
        }
        return null;
    }
    //Q.8)Implement PUT http request for Employee to update employee
    public void update(int id, Employee e){
        Iterator<Employee> itr = emp.iterator();
        while(itr.hasNext()){
            Employee emp = itr.next();
            if(e.getId()==id){
                emp.setId(e.getId());
                emp.setName(e.getName());
            }
        }
     }




}


