package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {
    List<Company> findAllBy();
    Company findAllByCompanyId(Long id);
}
