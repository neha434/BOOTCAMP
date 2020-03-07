package com.example.springExercise.ans5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Q.5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
@SpringBootApplication
public class ans5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ans5.class);
        Ambiguity  a = applicationContext.getBean(Ambiguity.class);
        a.display();
    }
}
