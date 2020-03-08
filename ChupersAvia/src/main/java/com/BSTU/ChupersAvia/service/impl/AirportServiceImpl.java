package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.repository.AirportRepository;
import com.BSTU.ChupersAvia.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl implements AirportService {
    private final AirportRepository airportRepository;
    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }
}
