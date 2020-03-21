package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.Company;

import java.util.List;

public interface CompanyService {
    Company save(Company company);
    List<Company> getAllCompany();
    Company getCompanyById(Long id);
}
