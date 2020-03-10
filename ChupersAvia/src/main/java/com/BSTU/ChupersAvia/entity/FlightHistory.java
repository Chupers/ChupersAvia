package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FlightHistory {
    @Id
    @GeneratedValue
    private Long flightHistoryId;
    @OneToOne
    private users users;
    @OneToMany(mappedBy = "flightHistory",orphanRemoval = true)
    private List<SalesOrder> salesOrder;
}
