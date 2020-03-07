package com.example.springExercise.ans5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class StudentHostel implements ShowDetails {
    @Override
    public void details(){
        System.out.println("These are student's hostel detail");
    }


}
