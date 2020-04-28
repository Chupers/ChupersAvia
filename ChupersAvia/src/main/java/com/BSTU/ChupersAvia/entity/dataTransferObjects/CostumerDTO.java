package com.BSTU.ChupersAvia.entity.dataTransferObjects;

import com.BSTU.ChupersAvia.entity.PassengerType;
import com.BSTU.ChupersAvia.entity.SalesOrder;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

public class CostumerDTO {
    private Long costumerId;
    private String fistName;
    private String secondName;
    private PassengerType passengerType;
    private List<SalesOrderDTO> salesOrders;

    public CostumerDTO(){}

    public Long getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(Long costumerId) {
        this.costumerId = costumerId;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public List<SalesOrderDTO> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(List<SalesOrderDTO> salesOrders) {
        this.salesOrders = salesOrders;
    }
}
