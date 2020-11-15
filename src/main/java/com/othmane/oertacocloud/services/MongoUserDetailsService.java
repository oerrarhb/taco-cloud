package com.othmane.oertacocloud.services;

import com.othmane.oertacocloud.data.TUser;
import com.othmane.oertacocloud.repositories.TUserRepository;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MongoUserDetailsService implements UserDetailsService {
    @Autowired
    private TUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TUser user = repository.findByUsername(username).get();
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
        User grantedUser = new User(user.getUsername(),user.getPassword(),authorities);
        System.out.println(grantedUser.getAuthorities());
        return grantedUser;
    }
}