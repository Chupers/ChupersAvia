package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.repository.CostumerRepository;
import com.BSTU.ChupersAvia.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerServiceImpl implements CostumerService {
    private final CostumerRepository costumerRepository;

    @Autowired
    public CostumerServiceImpl(CostumerRepository costumerRepository) {
        this.costumerRepository = costumerRepository;
    }
}
