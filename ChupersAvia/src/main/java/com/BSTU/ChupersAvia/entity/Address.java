package com.BSTU.ChupersAvia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Address {
    @Id
    @GeneratedValue
    Long AddressId;
    @NotNull
    String Country;
    @NotNull
    String City;
    @NotNull
    String Street;

}
