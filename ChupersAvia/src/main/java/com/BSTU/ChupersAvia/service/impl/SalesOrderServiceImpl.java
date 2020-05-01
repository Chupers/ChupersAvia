package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.SalesOrder;
import com.BSTU.ChupersAvia.entity.filters.SOFilters;
import com.BSTU.ChupersAvia.repository.SalesOrderRepository;
import com.BSTU.ChupersAvia.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SalesOrderServiceImpl implements SalesOrderService {
    private final UserService userService;
    private final BillingAccountService billingAccountService;
    private final FlightHistoryService flightHistoryService;
    private final SalesOrderRepository salesOrderRepository;
    private final OrderItemService orderItemService;

    @Autowired
    public SalesOrderServiceImpl(UserService userService, BillingAccountService billingAccountService, FlightHistoryService flightHistoryService, SalesOrderRepository salesOrderRepository, OrderItemService orderItemService) {
        this.userService = userService;
        this.billingAccountService = billingAccountService;
        this.flightHistoryService = flightHistoryService;
        this.salesOrderRepository = salesOrderRepository;
        this.orderItemService = orderItemService;
    }

    @Override
    public void save(SalesOrder salesOrder) {
        salesOrderRepository.save(salesOrder);
    }

    @Override
    public void createSO(SOFilters soFilters) {
        
    }

    @Override
    public List<SalesOrder> getAll() {
        return salesOrderRepository.getAll();
    }

    @Override
    public List<SalesOrder> getAllByUsers_UserId(Long userId) {
        return salesOrderRepository.getAllByUsers_UserId(userId);
    }

    @Override
    public SalesOrder getBySalesOrderId(Long salesOrderId) {
        return salesOrderRepository.getBySalesOrderId(salesOrderId);
    }
}
