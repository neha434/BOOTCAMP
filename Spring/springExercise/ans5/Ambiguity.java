package com.example.springExercise.ans5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ambiguity {
    @Autowired
    ShowDetails showDetails;
    public void display(){
        showDetails.details();
    }
}
