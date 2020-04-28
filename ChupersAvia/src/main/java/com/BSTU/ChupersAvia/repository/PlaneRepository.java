package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaneRepository extends CrudRepository<Plane,Long> {
    //Procedure
    Plane findByPlaneId(Long id);
    //Prodecure
    List<Plane> findAllBy();
}
