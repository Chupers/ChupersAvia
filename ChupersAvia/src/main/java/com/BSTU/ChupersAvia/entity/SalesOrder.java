package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class SalesOrder {
    @Id
    @GeneratedValue
    private Long salesOrderId;
    @OneToMany
    List<Costumer> costumers;
    @OneToMany
    List<OrderItem> orderItems;
    @OneToOne
    users users;
}
