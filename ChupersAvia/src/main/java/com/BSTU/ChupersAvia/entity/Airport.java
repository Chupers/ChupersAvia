package com.BSTU.ChupersAvia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Airport {
    @Id
    @GeneratedValue
    private Long airportId;

    private String airportName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Company company;
    @OneToOne
    private Address address;

    public Airport() {
    }

    public Long getAirportId() {
        return airportId;
    }

    public void setAirportId(Long airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
