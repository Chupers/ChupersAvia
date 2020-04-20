package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.Costumer;
import com.BSTU.ChupersAvia.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/costumer")
public class CostumerController {
    private final CostumerService costumerService;

    @Autowired
    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }
    @GetMapping("/getAll")
    List<Costumer> getCostumersList(){
        return costumerService.getAllCostumers();
    }
    @PostMapping("/save")
    Costumer saveCostumer(@RequestBody Costumer costumer){
        return costumerService.save(costumer);
    }
}
