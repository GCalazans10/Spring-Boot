package com.energialeste.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.energialeste.userdept.entities.User;

public interface UserRepository  extends JpaRepository <User, Long> {

}
