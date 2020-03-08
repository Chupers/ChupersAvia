package com.BSTU.ChupersAvia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FlightHistory {
    @Id
    @GeneratedValue
    Long flightHistoryId;
}
