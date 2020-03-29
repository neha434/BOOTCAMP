package com.example.springSecurityOauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


//Implement oauth 2 using spring security and authenticate a user which is saved in database using spring data jpa.
// Grant different Roles to different users and make sure that only authorized users of a given type can access the resource.
@Component
public class Bootstrap implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(userRepository.count()<1){
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            User user1 = new User();
            user1.setUsername("user");
            user1.setPassword(passwordEncoder.encode("pass"));
            user1.setRole("ROLE_USER");

            User user2 = new User();
            user2.setUsername("admin");
            user2.setPassword(passwordEncoder.encode("pass"));
            user2.setRole("ROLE_ADMIN");

            userRepository.save(user1);
            userRepository.save(user2);
            System.out.println("Total users saved::"+userRepository.count());

        }
    }
}