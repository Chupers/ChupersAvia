package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.Plane;
import com.BSTU.ChupersAvia.repository.PlaneRepository;
import com.BSTU.ChupersAvia.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {
    private final PlaneRepository planeRepository;

    @Autowired
    public PlaneServiceImpl(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    @Override
    public Plane save(Plane plane) {
        return planeRepository.save(plane);
    }

    @Override
    public List<Plane> getAllPlanes() {
        return planeRepository.findAllBy();
    }

    @Override
    public Plane getPlaneById(Long id) {
        return planeRepository.findByPlaneId(id);
    }
}
