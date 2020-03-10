package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;

@Entity
public class Airport {
    @Id
    @GeneratedValue
    private Long airportId;

    private String airportName;

    @ManyToOne(fetch = FetchType.LAZY)
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
