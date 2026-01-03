package com.demo.controller;

import com.demo.modal.user;
import com.demo.service.userService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class userController {
    userService userService;

    public userController(userService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public user createUser(@RequestBody user user){
        return userService.createUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<user> getAllUser(){
        return userService.getAllUser();
    }


}
