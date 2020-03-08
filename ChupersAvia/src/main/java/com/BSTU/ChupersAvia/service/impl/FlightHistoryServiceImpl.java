package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.repository.FlightHistoryRepository;
import com.BSTU.ChupersAvia.service.FlightHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightHistoryServiceImpl implements FlightHistoryService {
    private final FlightHistoryRepository flightHistoryRepository;

    @Autowired
    public FlightHistoryServiceImpl(FlightHistoryRepository flightHistoryRepository) {
        this.flightHistoryRepository = flightHistoryRepository;
    }
}
