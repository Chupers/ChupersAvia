package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.repository.UserRepository;
import com.BSTU.ChupersAvia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
