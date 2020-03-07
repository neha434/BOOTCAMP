package com.example.springExercise.ans5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StudentCollege implements ShowDetails{
@Override
    public void details(){ System.out.println("These are college details of student ");}


    }

