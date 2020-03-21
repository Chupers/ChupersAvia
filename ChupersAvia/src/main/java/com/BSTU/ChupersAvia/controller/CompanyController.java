package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.Company;
import com.BSTU.ChupersAvia.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
