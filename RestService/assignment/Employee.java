package com.example.RestService.assignment;
import javax.validation.constraints.Size;
import java.util.Date;

//Q.2) Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.

public class Employee {
    @Size(min=3)
    private String emp_name;
    private  Integer emp_id;
    private String emp_address;
    public Employee(String name, Integer id, String address) {
        super();
        this.emp_name = name;
        this.emp_id = id;
        this.emp_address = address;


    }
    public String getName() {
        return emp_name; }
    public Integer getId() {

        return emp_id;
    }
    public String getAddress() {
        return emp_address;
    }
    public void setName(String name) {

        this.emp_name = name;
    }
    public void setId(Integer id) {

        this.emp_id = id;
    }
    public void setDate(String address) {

        this.emp_address = address;
    }
    @Override
    public java.lang.String toString() {
        return "User{" + "Name=" + emp_name + ", Id=" + emp_id + ", Address=" + emp_address + '}'; }
}

