package com.BSTU.ChupersAvia.entity.dataTransferObjects;

import com.BSTU.ChupersAvia.entity.Airport;
import com.BSTU.ChupersAvia.entity.Plane;
import com.BSTU.ChupersAvia.entity.SalesOrder;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

public class OrderItemDTO {
    private Long orderItemId;
    private double pricePerSeat;
    private AirportDTO airportTo;
    private SalesOrderDTO salesOrder;
    private AirportDTO airportFrom;
    private PlaneDTO plane;
    private Timestamp dateTo;

    public  OrderItemDTO(){}

    public Long getOrderItemId() {
        return orderItemId;
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

    public AirportDTO getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(AirportDTO airportTo) {
        this.airportTo = airportTo;
    }

    public SalesOrderDTO getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(SalesOrderDTO salesOrder) {
        this.salesOrder = salesOrder;
    }

    public AirportDTO getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(AirportDTO airportFrom) {
        this.airportFrom = airportFrom;
    }

    public PlaneDTO getPlane() {
        return plane;
    }

    public void setPlane(PlaneDTO plane) {
        this.plane = plane;
    }

    public Timestamp getDateTo() {
        return dateTo;
    }

    public void setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo;
    }
}
