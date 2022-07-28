package com.sewmini.rentcloud.auth.authserver.repository;

import com.sewmini.rentcloud.auth.authserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String name);
}