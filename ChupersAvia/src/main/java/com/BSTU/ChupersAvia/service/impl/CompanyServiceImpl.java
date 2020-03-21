package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.Company;
import com.BSTU.ChupersAvia.repository.CompanyRepository;
import com.BSTU.ChupersAvia.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company save(Company company) {
       return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompany() {
        return companyRepository.findAllBy() ;
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findAllByCompanyId(id);
    }
}
