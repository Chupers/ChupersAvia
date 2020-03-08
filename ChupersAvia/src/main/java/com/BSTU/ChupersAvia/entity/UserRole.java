package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class UserRole {
    @Id
    @GeneratedValue
   Long userRoleId;
    @NotNull
   String roleName;
   @OneToOne
    users users;

    public UserRole() {
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public com.BSTU.ChupersAvia.entity.users getUsers() {
        return users;
    }

    public void setUsers(com.BSTU.ChupersAvia.entity.users users) {
        this.users = users;
    }
}
