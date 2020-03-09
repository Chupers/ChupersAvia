package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FlightHistory {
    @Id
    @GeneratedValue
    Long flightHistoryId;
    @OneToOne
    users users;
    @OneToMany
    List<SalesOrder> salesOrder;
}
