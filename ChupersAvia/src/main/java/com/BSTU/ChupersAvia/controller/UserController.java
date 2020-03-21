package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.users;
import com.BSTU.ChupersAvia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    List<users> getUserList(){
        return userService.getAllUsers();
    }
    @PostMapping("/save")
    users saveUser(@RequestBody users users){
        return userService.save(users);
    }
}
