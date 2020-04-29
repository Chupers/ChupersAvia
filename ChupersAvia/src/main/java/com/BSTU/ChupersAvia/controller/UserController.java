package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.BillingAccount;
import com.BSTU.ChupersAvia.entity.UserRole;
import com.BSTU.ChupersAvia.entity.dataTransferObjects.UserDTO;
import com.BSTU.ChupersAvia.entity.users;
import com.BSTU.ChupersAvia.repository.RoleRepository;
import com.BSTU.ChupersAvia.service.BillingAccountService;
import com.BSTU.ChupersAvia.service.UserService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final RoleRepository roleRepository;
    private final BillingAccountService billingAccountService;
    private final DozerBeanMapper mapper;

    @Autowired
    public UserController(UserService userService, RoleRepository roleRepository, BillingAccountService billingAccountService, DozerBeanMapper mapper) {
        this.userService = userService;
        this.roleRepository = roleRepository;
        this.billingAccountService = billingAccountService;
        this.mapper = mapper;
    }
    @PostMapping("/rol")
    UserRole createNewRole(@RequestBody UserRole userRole){
        return roleRepository.save(userRole);
    }

    @GetMapping("/getByUserName/{name}")
    UserDTO getUserByUserName(@PathVariable("name") String userName){
        return mapper.map(userService.getUserByUserName(userName),UserDTO.class);

    }
    @GetMapping("/getAll")
    List<UserDTO> getUserList(){
        return userService.getAllUsers()
                .stream()
                .map(entity -> mapper.map(entity,UserDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/registration")
    void saveUser(@RequestBody users users){
        UserRole userRole = roleRepository.findByRoleName("USER");
        BillingAccount billingAccount = new BillingAccount();
        billingAccountService.save(billingAccount);
        users.setBillingAccount(billingAccount);
        userRole.AddUser(users);
        users.setUserRole(userRole);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        users.setHashPassword(bCryptPasswordEncoder.encode(users.getHashPassword()));
        userService.save(users);
    }
}
