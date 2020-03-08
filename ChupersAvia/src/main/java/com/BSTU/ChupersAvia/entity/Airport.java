package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;

@Entity
public class Airport {
    @Id
    @GeneratedValue
    Long airportId;

    String airportName;

}
