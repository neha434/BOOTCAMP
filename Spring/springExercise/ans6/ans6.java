package com.example.springExercise.ans6;

//6) Perform Constructor Injection in a Spring Bean
interface EmployeeInfo{
    void details();
}
 class ConstructorInjection {
    EmployeeInfo info;
    public ConstructorInjection(EmployeeInfo emp) {
        info = emp;
    }

    public ConstructorInjection() {
        info = new Employee();
    }

    public void EmployeeDetails() {
        info.details();
    }
}

    class Employee implements EmployeeInfo {
        private int id = 1;
        private String name = "Neha";

        public void details() {
            System.out.println("Id " + id);
            System.out.println("Name " + name);
        }
    }
    class ans6 {
        public static void main(String[] args) {
            ConstructorInjection i = new ConstructorInjection();
            i.EmployeeDetails();
        }


    }

