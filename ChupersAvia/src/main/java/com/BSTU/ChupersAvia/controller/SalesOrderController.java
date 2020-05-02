package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.filters.SOFilters;
import com.BSTU.ChupersAvia.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/salesOrder")
public class SalesOrderController {
    private final SalesOrderService salesOrderService;
    @Autowired
    public SalesOrderController(SalesOrderService salesOrderService) {
        this.salesOrderService = salesOrderService;
    }

    @PostMapping
    void createSO(@RequestBody SOFilters soFilters){
        salesOrderService.createSO(soFilters);
    }
}
