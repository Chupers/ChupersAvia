package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Costumer {
    @Id
    @GeneratedValue
    private Long costumerId;
    @NotNull
    private String fistName;
    @NotNull
    private String secondName;
    @NotNull
    private PassengerType passengerType;
    @OneToMany(mappedBy = "costumers",orphanRemoval = true)
    private List<SalesOrder> salesOrders;

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
}
