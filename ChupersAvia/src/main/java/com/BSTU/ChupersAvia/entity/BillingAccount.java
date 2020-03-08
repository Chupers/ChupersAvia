package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;


@Entity
public class BillingAccount {
    @Id
    @GeneratedValue
    private Long billingAccountId;

    private double currentBill;

    public BillingAccount(){}

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
