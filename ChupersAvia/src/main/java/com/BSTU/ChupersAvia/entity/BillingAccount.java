package com.BSTU.ChupersAvia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class BillingAccount {
    @Id
    @GeneratedValue
    private Long billingAccountId;

    private double currentBill;

    @OneToOne(mappedBy = "billingAccount")
    private users users;

    public BillingAccount(){}

    public com.BSTU.ChupersAvia.entity.users getUsers() {
        return users;
    }

    public void setUsers(com.BSTU.ChupersAvia.entity.users users) {
        this.users = users;
    }

    public double getCurrentBill() {
        return currentBill;
    }

    public Long getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(Long billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public void setCurrentBill(double currentBill) {
        this.currentBill = currentBill;
    }
}
