package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.FlightHistory;
import com.BSTU.ChupersAvia.service.FlightHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/flightHistory")
public class FlightHistoryController {
    private final FlightHistoryService flightHistoryService;

    @Autowired
    public FlightHistoryController(FlightHistoryService flightHistoryService) {
        this.flightHistoryService = flightHistoryService;
    }

    @GetMapping("/getAll")
    List<FlightHistory> getFlightHistoryList(){
        return flightHistoryService.getAllFlightHistory();
    }

    @PostMapping("/save")
    FlightHistory saveFlightHistory(@RequestBody FlightHistory flightHistory){
        return flightHistoryService.save(flightHistory);
    }
}
