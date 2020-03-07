package com.example.springExercise.ans3;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private Integer Rollno;
    private String Name;
    private Float marks;
    public Student(){ System.out.println("student constructor");}

    public Integer getRollno() {
        return Rollno;
    }

    public String getName() {
        return Name;
    }

    public Float getMarks() {
        return marks;
    }

    public void setRollno(Integer rollno) {
        Rollno = rollno;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }
    public void show(){
        System.out.println("Show Employee");
    }
}

