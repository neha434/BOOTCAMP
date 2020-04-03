package com.springboot.ecommerceApplication.services;

import com.springboot.ecommerceApplication.co.SellerCO;
import com.springboot.ecommerceApplication.domain.Role;
import com.springboot.ecommerceApplication.domain.user.Seller;
import com.springboot.ecommerceApplication.repositories.RoleRepo;
import com.springboot.ecommerceApplication.repositories.SellerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {

    @Autowired
    SellerRepo sellerRepository;
    @Autowired
    RoleRepo roleRepository;

    public void registerSeller(SellerCO sellerCO){
        Seller registerSeller = new Seller();
        BeanUtils.copyProperties(sellerCO,registerSeller);
//        Role sellerRole = roleRepository.findByAuthority("ROLE_SELLER");
        List<Role> roleList = new ArrayList<>();
        roleList.add(roleRepository.findByAuthority("ROLE_SELLER"));
        registerSeller.setRoleList(roleList);
        sellerRepository.save(registerSeller);
    }
}