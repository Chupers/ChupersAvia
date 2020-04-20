package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.Airport;
import com.BSTU.ChupersAvia.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
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
