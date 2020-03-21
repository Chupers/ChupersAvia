package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.Airport;
import com.BSTU.ChupersAvia.repository.AirportRepository;
import com.BSTU.ChupersAvia.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {
    private final AirportRepository airportRepository;
    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public Airport save(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAllBy();
    }

    @Override
    public Airport getAirportById(Long id) {
        return airportRepository.findAllByAirportId(id);
    }
}
