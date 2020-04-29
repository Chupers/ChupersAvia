package com.BSTU.ChupersAvia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long orderItemId;

    @NotNull
    private double pricePerSeat;

    @OneToOne
    private Airport airportTo;

    @OneToMany(mappedBy = "orderItems",fetch = FetchType.LAZY)
    private List<SalesOrder> salesOrderList;

    @OneToOne
    private Airport airportFrom;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Plane plane;

    private String arrivalTime;

    private String timeOfDeparture;

    private Date dateTo;

    public void setSalesOrderList(List<SalesOrder> salesOrderList) {
        this.salesOrderList = salesOrderList;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public List<SalesOrder> getSalesOrderList() {
        return salesOrderList;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public double getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(double pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public Airport getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(Airport airportTo) {
        this.airportTo = airportTo;
    }

    public Airport getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(Airport airportFrom) {
        this.airportFrom = airportFrom;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public OrderItem() {
    }


}
