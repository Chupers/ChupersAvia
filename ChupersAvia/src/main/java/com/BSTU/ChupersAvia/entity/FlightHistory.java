package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FlightHistory {
    @Id
    @GeneratedValue
    private Long flightHistoryId;
    @OneToOne
    private users users;
    @OneToMany(mappedBy = "flightHistory",orphanRemoval = true)
    private List<SalesOrder> salesOrder;

    public FlightHistory(){}

    public void addSalesOrder(SalesOrder salesOrder){
        this.salesOrder.add(salesOrder);
    }
    public Long getFlightHistoryId() {
        return flightHistoryId;
    }

    public void setFlightHistoryId(Long flightHistoryId) {
        this.flightHistoryId = flightHistoryId;
    }

    public com.BSTU.ChupersAvia.entity.users getUsers() {
        return users;
    }

    public void setUsers(com.BSTU.ChupersAvia.entity.users users) {
        this.users = users;
    }

    public List<SalesOrder> getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(List<SalesOrder> salesOrder) {
        this.salesOrder = salesOrder;
    }
}
