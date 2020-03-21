package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.Airport;

import java.util.List;

public interface AirportService {
    Airport save(Airport airport);
    List<Airport> getAllAirports();
    Airport getAirportById(Long id);
}
