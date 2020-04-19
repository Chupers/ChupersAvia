package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class users {
    @Id
    @GeneratedValue
    private int userId;
    @NotNull
    private String userName;
    @NotNull
    private String hashPassword;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
