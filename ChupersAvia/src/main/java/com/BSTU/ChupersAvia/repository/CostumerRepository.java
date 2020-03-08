package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Costumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends CrudRepository<Costumer,Long> {
}
