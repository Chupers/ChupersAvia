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
    @OneToOne
    private UserRole userRole;

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
