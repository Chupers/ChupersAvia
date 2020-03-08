package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.repository.CompanyRepository;
import com.BSTU.ChupersAvia.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
}
