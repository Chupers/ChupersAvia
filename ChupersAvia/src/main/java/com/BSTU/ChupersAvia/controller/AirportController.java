package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.Airport;
import com.BSTU.ChupersAvia.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/airport")
public class AirportController {
    private final AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/getAll")
    List<Airport> getAirportList(){
       return airportService.getAllAirports();
    }

    @PostMapping("/save")
    Airport saveAirport(@RequestBody Airport airport){
        return airportService.save(airport);
    }
}
