package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.SalesOrder;
import com.BSTU.ChupersAvia.entity.filters.SOFilters;

import java.util.List;

public interface SalesOrderService {
    void save(SalesOrder salesOrder);
    void createSO(SOFilters soFilters);
    List<SalesOrder> getAll();
    List<SalesOrder> getAllByUsers_UserId(Long userId);
    SalesOrder getBySalesOrderId(Long salesOrderId);
}
