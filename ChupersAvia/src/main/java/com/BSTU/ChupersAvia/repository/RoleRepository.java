package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.UserRole;
import com.BSTU.ChupersAvia.entity.users;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<UserRole,Long> {
    //Procedure
    UserRole findByRoleName(String roleName);
    UserRole findByUsers(users users);
}
