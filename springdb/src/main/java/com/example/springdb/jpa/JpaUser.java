package com.example.springdb.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdb.model.User;

public interface JpaUser extends JpaRepository<User, Long> {
    
}
