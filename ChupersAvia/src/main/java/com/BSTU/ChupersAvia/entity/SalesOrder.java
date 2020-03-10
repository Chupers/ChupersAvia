package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class SalesOrder {
    @Id
    @GeneratedValue
    private Long salesOrderId;
    @ManyToOne(fetch = FetchType.LAZY)
    private Costumer costumers;

    public Costumer getCostumers() {
        return costumers;
    }

    public void setCostumers(Costumer costumers) {
        this.costumers = costumers;
    }

    public FlightHistory getFlightHistory() {
        return flightHistory;
    }

    public void setFlightHistory(FlightHistory flightHistory) {
        this.flightHistory = flightHistory;
    }

    @OneToMany(mappedBy = "salesOrder",orphanRemoval = true)
    private List<OrderItem> orderItems;
    @ManyToOne(fetch = FetchType.LAZY)
    private users users;
    @ManyToOne(fetch = FetchType.LAZY)
    private BillingAccount billingAccount;
    @ManyToOne(fetch = FetchType.LAZY)
    private FlightHistory flightHistory;
    public Long getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(Long salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public com.BSTU.ChupersAvia.entity.users getUsers() {
        return users;
    }

    public void setUsers(com.BSTU.ChupersAvia.entity.users users) {
        this.users = users;
    }

    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    public SalesOrder() {}
}
