package com.demo.service;

import com.demo.modal.user;
import com.demo.repo.userRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    userRepo userRepo;
    public userService(userRepo userRepo) {
        this.userRepo = userRepo;
    }

    public user createUser(user user){
         return userRepo.save(user);
    }

    public List<user> getAllUser(){
        return userRepo.findAll();
    }



}
