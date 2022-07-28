package com.sewmini.rentcloud.auth.authserver.service;

import com.sewmini.rentcloud.auth.authserver.model.AuthUserDetail;
import com.sewmini.rentcloud.auth.authserver.model.User;
import com.sewmini.rentcloud.auth.authserver.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

// UserDetailsService is a pre defined interface which used to load users details
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailRepository userDetailRepository;

    //We have to load User from DB and handover to UserDetailsService..........
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> optionalUser = userDetailRepository.findByUsername(name);
        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username or Password is wrong!"));

        UserDetails userDetail = new AuthUserDetail(optionalUser.get());

        //check if this account is expire or valid or anything.....
        new AccountStatusUserDetailsChecker().check(userDetail);
        return userDetail;

    }

}
