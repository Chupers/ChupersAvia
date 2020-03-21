package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.FlightHistory;
import com.BSTU.ChupersAvia.repository.FlightHistoryRepository;
import com.BSTU.ChupersAvia.service.FlightHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightHistoryServiceImpl implements FlightHistoryService {
    private final FlightHistoryRepository flightHistoryRepository;

    @Autowired
    public FlightHistoryServiceImpl(FlightHistoryRepository flightHistoryRepository) {
        this.flightHistoryRepository = flightHistoryRepository;
    }

    @Override
    public FlightHistory save(FlightHistory flightHistory) {
        return flightHistoryRepository.save(flightHistory);
    }

    @Override
    public List<FlightHistory> getAllFlightHistory() {
        return flightHistoryRepository.findAllBy();
    }

    @Override
    public FlightHistory getFlightHistoryById(Long id) {
        return flightHistoryRepository.findByFlightHistoryId(id);
    }
}
