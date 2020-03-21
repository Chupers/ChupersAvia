package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<users,Long> {
    users findAllByUserName(String userName);
    users findByUserId(Long id);
    List<users> findAllBy();
}
