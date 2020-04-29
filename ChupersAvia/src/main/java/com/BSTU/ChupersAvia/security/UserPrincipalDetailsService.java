package com.BSTU.ChupersAvia.security;


import com.BSTU.ChupersAvia.entity.users;
import com.BSTU.ChupersAvia.repository.RoleRepository;
import com.BSTU.ChupersAvia.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    UserRepository userRepository;
   private final RoleRepository roleRepository;

    public UserPrincipalDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        users user = userRepository.findAllByUserName(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);


        return userPrincipal;

    }

}
