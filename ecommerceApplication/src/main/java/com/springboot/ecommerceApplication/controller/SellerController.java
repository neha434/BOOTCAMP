package com.springboot.ecommerceApplication.controller;

import com.springboot.ecommerceApplication.co.SellerCO;
import com.springboot.ecommerceApplication.domain.user.Seller;
import com.springboot.ecommerceApplication.exception.SellerAlreadyExistsException;
import com.springboot.ecommerceApplication.repositories.SellerRepo;
import com.springboot.ecommerceApplication.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/seller")
public class SellerController {

    //    @GetMapping("/{email}")
    @Autowired
    SellerRepo sellerRepository;
    @Autowired
    SellerService sellerService;
    @PostMapping("/seller")
    public String registerSeller(@RequestBody SellerCO sellerCO, WebRequest webRequest){
        Seller seller = sellerRepository.findByEmail(sellerCO.getEmail());
        if (seller != null){
            throw new SellerAlreadyExistsException("Account Already Exist With This Email Id");
        }
        else {
            sellerService.registerSeller(sellerCO);
        }
        return "Seller Successfully Registered";
    }
}