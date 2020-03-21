package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Costumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostumerRepository extends CrudRepository<Costumer,Long> {
    List<Costumer> findAllBy();
    Costumer findByCostumerId(Long id);
}
