package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Airport;
import com.BSTU.ChupersAvia.entity.BillingAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends CrudRepository<Airport,Long> {
    List<Airport> findAllBy();
    Airport findAllByAirportId (Long id);
}
