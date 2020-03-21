package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.BillingAccount;
import com.BSTU.ChupersAvia.entity.Plane;

import java.util.List;

public interface PlaneService {
    Plane save(Plane plane);
    List<Plane> getAllPlanes();
    Plane getPlaneById(Long id);
}
