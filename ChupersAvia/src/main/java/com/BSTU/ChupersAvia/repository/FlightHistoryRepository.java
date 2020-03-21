package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.FlightHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightHistoryRepository extends CrudRepository<FlightHistory,Long> {
    List<FlightHistory> findAllBy();
    FlightHistory findByFlightHistoryId(Long id);
}
