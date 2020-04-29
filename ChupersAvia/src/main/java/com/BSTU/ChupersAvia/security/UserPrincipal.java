package com.BSTU.ChupersAvia.security;
import com.BSTU.ChupersAvia.entity.users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserPrincipal implements UserDetails {

    private users user;

    public UserPrincipal(users user) {
        this.user = user;
    }


    @Override
    public Collection <? extends GrantedAuthority> getAuthorities() {
        List <GrantedAuthority> authorities = new ArrayList <>();

        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + "USER" +
                "");
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.user.getHashPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}