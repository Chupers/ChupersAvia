package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.Costumer;

import java.util.List;

public interface CostumerService {
    Costumer save(Costumer costumer);
    List<Costumer> getAllCostumers();
    Costumer getCostumerById(Long id);
}
