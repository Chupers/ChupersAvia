package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.*;
import com.BSTU.ChupersAvia.entity.filters.SOFilters;
import com.BSTU.ChupersAvia.repository.SalesOrderRepository;
import com.BSTU.ChupersAvia.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SalesOrderServiceImpl implements SalesOrderService {
    private final UserService userService;
    private final BillingAccountService billingAccountService;
    private final FlightHistoryService flightHistoryService;
    private final SalesOrderRepository salesOrderRepository;
    private final OrderItemService orderItemService;
    private final CostumerService costumerService;

    @Autowired
    public SalesOrderServiceImpl(UserService userService, BillingAccountService billingAccountService, FlightHistoryService flightHistoryService, SalesOrderRepository salesOrderRepository, OrderItemService orderItemService, CostumerService costumerService) {
        this.userService = userService;
        this.billingAccountService = billingAccountService;
        this.flightHistoryService = flightHistoryService;
        this.salesOrderRepository = salesOrderRepository;
        this.orderItemService = orderItemService;
        this.costumerService = costumerService;
    }

    @Override
    public void save(SalesOrder salesOrder) {
        salesOrderRepository.save(salesOrder);
    }
    @Transactional
    @Override
    public void createSO(SOFilters soFilters) {
        FlightHistory flightHistory = flightHistoryService.getFlightHistoryByUserId(soFilters.getUserId());
        if(flightHistory == null) {
            flightHistory = new FlightHistory();
            flightHistory.setUsers(userService.getUserById(soFilters.getUserId()));
            flightHistoryService.save(flightHistory);
            flightHistory = flightHistoryService.getFlightHistoryByUserId(soFilters.getUserId());
        }

        flightHistory.addSalesOrder(completedSO(soFilters,flightHistory));
        flightHistoryService.save(flightHistory);

    }
    private SalesOrder completedSO(SOFilters soFilters,FlightHistory flightHistory){
        Costumer costumer = new Costumer();
        costumer.setFistName(soFilters.getFirstName());
        costumer.setSecondName(soFilters.getSecondName());
        costumer.setPassengerType(PassengerType.ADULT);
        costumerService.save(costumer);
        SalesOrder salesOrder = new SalesOrder();
        BillingAccount billingAccount = billingAccountService.getBillingAccountByUserId(soFilters.getUserId());
        billingAccount.setCreditCardNumber(soFilters.getCardNumber());
        billingAccountService.save(billingAccount);
        salesOrder.setUsers(userService.getUserById(soFilters.getUserId()));
        salesOrder.setCostumers(costumer);
        salesOrder.setOrderItems(orderItemService.getOrderItemById(soFilters.getOrderItemId()));
        salesOrder.setFlightHistory(flightHistory);
        salesOrderRepository.save(salesOrder);
        return salesOrder;
    }

    @Override
    public List<SalesOrder> getAll() {
        return salesOrderRepository.getAllBy();
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
