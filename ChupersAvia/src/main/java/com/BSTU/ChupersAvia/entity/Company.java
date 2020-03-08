package com.BSTU.ChupersAvia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    @GeneratedValue
    Long companyId;
}
