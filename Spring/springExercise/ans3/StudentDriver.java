package com.example.springExercise.ans3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDriver {
    @Autowired
    private Student stu;
    public StudentDriver(){System.out.println("driver constructor");}
    public void showDetail(){
        System.out.println("Display");
        stu.show();
    }

}
