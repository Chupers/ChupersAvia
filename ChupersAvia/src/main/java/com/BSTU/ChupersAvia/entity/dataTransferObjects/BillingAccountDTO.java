package com.BSTU.ChupersAvia.entity.dataTransferObjects;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class BillingAccountDTO {

    private Long billingAccountId;

    private double currentBill;
    @JsonIgnore
    private UserDTO users;

    public BillingAccountDTO(){}

    public Long getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(Long billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public double getCurrentBill() {
        return currentBill;
    }

    public void setCurrentBill(double currentBill) {
        this.currentBill = currentBill;
    }

    public UserDTO getUsers() {
        return users;
    }

    public void setUsers(UserDTO users) {
        this.users = users;
    }
}
