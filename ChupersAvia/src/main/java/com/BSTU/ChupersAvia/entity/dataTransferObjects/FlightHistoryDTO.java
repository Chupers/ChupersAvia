package com.BSTU.ChupersAvia.entity.dataTransferObjects;

import com.BSTU.ChupersAvia.entity.SalesOrder;
import com.BSTU.ChupersAvia.entity.users;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class FlightHistoryDTO {
    private Long flightHistoryId;
    private UserDTO users;
    private List<SalesOrder> salesOrder;

    public FlightHistoryDTO(){}

    public Long getFlightHistoryId() {
        return flightHistoryId;
    }

    public void setFlightHistoryId(Long flightHistoryId) {
        this.flightHistoryId = flightHistoryId;
    }

    public UserDTO getUsers() {
        return users;
    }

    public void setUsers(UserDTO users) {
        this.users = users;
    }

    public List<SalesOrder> getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(List<SalesOrder> salesOrder) {
        this.salesOrder = salesOrder;
    }
}
