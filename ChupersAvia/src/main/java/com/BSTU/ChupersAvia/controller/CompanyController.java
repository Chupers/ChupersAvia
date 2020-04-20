package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.Company;
import com.BSTU.ChupersAvia.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping("/getAll")
    List<Company> getCompanyList(){
        return companyService.getAllCompany();
    }
    @PostMapping("/save")
    Company saveCompany(@RequestBody Company company){
        return companyService.save(company);
    }
}
