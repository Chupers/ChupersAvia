package com.BSTU.ChupersAvia.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.List;

@Entity
public class UserRole {
    @Id
    @GeneratedValue
   Long userRoleId;
    @NotNull
   String roleName;
    @OneToMany
    List<users> users;

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

    public List<com.BSTU.ChupersAvia.entity.users> getUsers() {
        return users;
    }

    public void setUsers(List<com.BSTU.ChupersAvia.entity.users> users) {
        this.users = users;
    }
}
