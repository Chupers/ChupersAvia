package com.BSTU.ChupersAvia.entity.filters;

import java.sql.Date;
import java.sql.Timestamp;

public class SearchFilter {

    private Date dateTo;

    private String cityFrom;

    private String cityTo;

    public SearchFilter() {
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }
}
