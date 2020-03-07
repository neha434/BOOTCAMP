package com.example.springExercise.ans3;

import com.example.springExercise.SpringExerciseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//Q.3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
@SpringBootApplication
public class ans3 {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(SpringExerciseApplication.class);
        StudentDriver studentDriver = configurableApplicationContext.getBean(StudentDriver.class);
                studentDriver.showDetail();
    }

}
