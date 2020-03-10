package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class users {
    @Id
    @GeneratedValue
    private Long userId;
    @NotNull
    private Long hashPassword;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserRole userRole;
    @OneToOne
    private BillingAccount billingAccount;

    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    public users() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(Long hashPassword) {
        this.hashPassword = hashPassword;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
