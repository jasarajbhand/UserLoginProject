package com.java.springrest.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springrest.entity.User;

public interface UserService extends JpaRepository<User, Integer> {

}
