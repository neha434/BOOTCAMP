package com.example.springExercise;

import com.example.springExercise.ans3.Student;
import com.example.springExercise.ans3.StudentDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Q.4) Get a Spring Bean from application context and display its properties.
@SpringBootApplication
public class SpringExerciseApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringExerciseApplication.class, args);

		StudentDriver studentDriver = applicationContext.getBean(StudentDriver.class);
		studentDriver.showDetail();
	}
}
