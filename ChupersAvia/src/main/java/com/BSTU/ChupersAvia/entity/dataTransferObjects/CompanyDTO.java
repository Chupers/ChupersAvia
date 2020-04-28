package com.BSTU.ChupersAvia.entity.dataTransferObjects;

import com.BSTU.ChupersAvia.entity.Airport;

import javax.persistence.OneToMany;
import java.util.List;

public class CompanyDTO {

    private Long companyId;
    private List<AirportDTO> airports;
    private String companyName;

    public CompanyDTO(){}

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public List<AirportDTO> getAirports() {
        return airports;
    }

    public void setAirports(List<AirportDTO> airports) {
        this.airports = airports;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
