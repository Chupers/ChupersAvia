package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.BillingAccount;
import com.BSTU.ChupersAvia.entity.users;

import java.util.List;

public interface UserService {
    users save(users billingAccount);
    List<users> getAllUsers();
    users getUserById(Long id);
    users getUserByUserName(String username);
}
