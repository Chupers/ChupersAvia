package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
