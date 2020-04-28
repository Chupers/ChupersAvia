package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.users;
import com.BSTU.ChupersAvia.repository.UserRepository;
import com.BSTU.ChupersAvia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public users save(users users) {
        return userRepository.save(users);
    }

    @Override
    public List<users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public users getUserById(Long id) {
        return userRepository.findByUserId(id);
    }

    @Override
    public users getUserByUserName(String username) {
        return userRepository.findAllByUserName(username);
    }
}
