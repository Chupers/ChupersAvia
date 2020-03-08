package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport,Long> {
}
