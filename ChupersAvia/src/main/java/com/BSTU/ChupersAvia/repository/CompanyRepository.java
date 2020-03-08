package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {
}
