package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.FlightHistory;
import com.BSTU.ChupersAvia.service.FlightHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
