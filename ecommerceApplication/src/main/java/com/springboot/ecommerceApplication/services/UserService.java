package com.springboot.ecommerceApplication.services;

import com.springboot.ecommerceApplication.dto.CustomerDto;
import com.springboot.ecommerceApplication.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepository;

    public void addUser(CustomerDto customerDto){
    }
}