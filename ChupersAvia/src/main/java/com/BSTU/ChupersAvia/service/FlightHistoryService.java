package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.FlightHistory;

import java.util.List;

public interface FlightHistoryService {
    FlightHistory save(FlightHistory flightHistory);
    List<FlightHistory> getAllFlightHistory();
    FlightHistory getFlightHistoryById(Long id);
    FlightHistory  getFlightHistoryByUserId(Long userId);
}
