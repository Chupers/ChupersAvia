package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.FlightHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightHistoryRepository extends CrudRepository<FlightHistory,Long> {
}
