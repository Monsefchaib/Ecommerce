package com.ecommercespring.ecommercespring.controller;


import com.ecommercespring.ecommercespring.Services.UserService;
import com.ecommercespring.ecommercespring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("getall")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }





}
