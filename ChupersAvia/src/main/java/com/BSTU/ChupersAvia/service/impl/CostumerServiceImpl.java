package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.Costumer;
import com.BSTU.ChupersAvia.repository.CostumerRepository;
import com.BSTU.ChupersAvia.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumerServiceImpl implements CostumerService {
    private final CostumerRepository costumerRepository;

    @Autowired
    public CostumerServiceImpl(CostumerRepository costumerRepository) {
        this.costumerRepository = costumerRepository;
    }

    @Override
    public Costumer save(Costumer costumer) {
        return costumerRepository.save(costumer);
    }

    @Override
    public List<Costumer> getAllCostumers() {
        return costumerRepository.findAllBy();
    }

    @Override
    public Costumer getCostumerById(Long id) {
        return costumerRepository.findByCostumerId(id);
    }
}
