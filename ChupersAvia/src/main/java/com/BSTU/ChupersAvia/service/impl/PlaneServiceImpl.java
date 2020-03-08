package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.repository.PlaneRepository;
import com.BSTU.ChupersAvia.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaneServiceImpl implements PlaneService {
    private final PlaneRepository planeRepository;

    @Autowired
    public PlaneServiceImpl(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }
}
