package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.UserRole;
import com.BSTU.ChupersAvia.entity.users;
import com.BSTU.ChupersAvia.repository.RoleRepository;
import com.BSTU.ChupersAvia.repository.UserRepository;
import com.BSTU.ChupersAvia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final RoleRepository roleRepository;

    @Autowired
    public UserController(UserService userService, RoleRepository roleRepository) {
        this.userService = userService;
        this.roleRepository = roleRepository;
    }
    @PostMapping("/rol")
    UserRole createNewRole(@RequestBody UserRole userRole){
        return roleRepository.save(userRole);
    }

    @GetMapping("/getAll")
    List<users> getUserList(){
        return userService.getAllUsers();
    }

    @PostMapping("/registration")
    void saveUser(@RequestBody users users){
        UserRole userRole = roleRepository.findByRoleName("USER");
        userRole.AddUser(users);
        users.setUserRole(userRole);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        users.setHashPassword(bCryptPasswordEncoder.encode(users.getHashPassword()));
        userService.save(users);
    }
}
