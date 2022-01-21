package com.java.springrest.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springrest.entity.UserRole;

public interface UserRoleService extends JpaRepository<UserRole, Integer> {

}
