package com.BSTU.ChupersAvia.entity.dataTransferObjects;

import com.BSTU.ChupersAvia.entity.BillingAccount;
import com.BSTU.ChupersAvia.entity.UserRole;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class UserDTO {

    private int userId;
    private String userName;
    private BillingAccountDTO billingAccount;

    public  UserDTO(){}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BillingAccountDTO getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccountDTO billingAccount) {
        this.billingAccount = billingAccount;
    }
}
