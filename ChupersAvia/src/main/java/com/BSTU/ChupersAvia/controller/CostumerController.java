package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.Costumer;
import com.BSTU.ChupersAvia.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
