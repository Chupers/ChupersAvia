package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.Plane;
import com.BSTU.ChupersAvia.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/plane")
public class PlaneController {
    private final PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @GetMapping("/getAll")
    List<Plane> getPlanList(){
        return planeService.getAllPlanes();
    }
    @PostMapping("/save")
    Plane savePlane(@RequestBody Plane plane){
        return planeService.save(plane);
    }
}
