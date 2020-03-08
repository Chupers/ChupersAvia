package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue
    private Long orderItemId;
    @NotNull
    private double pricePerSeat;
    @OneToOne
    private Airport airportTo;
    @OneToOne
    private Airport airportFrom;
    @OneToOne
    private Plane plane;

}
