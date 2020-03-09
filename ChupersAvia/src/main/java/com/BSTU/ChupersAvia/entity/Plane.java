package com.BSTU.ChupersAvia.entity;

import org.hibernate.criterion.Order;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Plane {
    @Id
    @GeneratedValue
    private Long planeId;
    @NotNull
    private String planeModel;
    @OneToOne
    private Company company;
    @NotNull
    private int planeСapacity;

    public Plane() {
    }
    @OneToMany
    List<OrderItem> orderItemList;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Long getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Long planeId) {
        this.planeId = planeId;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getPlaneСapacity() {
        return planeСapacity;
    }

    public void setPlaneСapacity(int planeСapacity) {
        this.planeСapacity = planeСapacity;
    }
}
