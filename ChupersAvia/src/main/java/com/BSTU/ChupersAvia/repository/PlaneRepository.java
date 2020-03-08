package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends CrudRepository<Plane,Long> {
}
