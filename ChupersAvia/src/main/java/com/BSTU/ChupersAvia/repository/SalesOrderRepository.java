package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.SalesOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SalesOrderRepository extends CrudRepository<SalesOrder,Long> {
    List<SalesOrder> getAll();
    List<SalesOrder> getAllByUsers_UserId(Long userId);
    SalesOrder getBySalesOrderId(Long salesOrderId);
}
