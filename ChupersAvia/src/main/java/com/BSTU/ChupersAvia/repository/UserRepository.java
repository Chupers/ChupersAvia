package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<users,Long> {
    users findAllByUserName(String userName);
}
