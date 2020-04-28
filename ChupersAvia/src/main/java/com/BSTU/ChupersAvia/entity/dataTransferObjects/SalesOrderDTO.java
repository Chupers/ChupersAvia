package com.BSTU.ChupersAvia.entity.dataTransferObjects;

import com.BSTU.ChupersAvia.entity.*;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class SalesOrderDTO {
    private Long salesOrderId;
    private CostumerDTO costumers;
    private List<OrderItemDTO> orderItems;
    private UserDTO users;
    private BillingAccountDTO billingAccount;
    private FlightHistoryDTO flightHistory;

    public SalesOrderDTO(){}

    public Long getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(Long salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public CostumerDTO getCostumers() {
        return costumers;
    }

    public void setCostumers(CostumerDTO costumers) {
        this.costumers = costumers;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public UserDTO getUsers() {
        return users;
    }

    public void setUsers(UserDTO users) {
        this.users = users;
    }

    public BillingAccountDTO getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccountDTO billingAccount) {
        this.billingAccount = billingAccount;
    }

    public FlightHistoryDTO getFlightHistory() {
        return flightHistory;
    }

    public void setFlightHistory(FlightHistoryDTO flightHistory) {
        this.flightHistory = flightHistory;
    }
}
