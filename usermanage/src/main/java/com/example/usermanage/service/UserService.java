package com.example.usermanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanage.entity.UserEntity;
import com.example.usermanage.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return null;
    }

    public UserEntity getUserById(int id) {
        return null;
    }

    public void createUser(String name, String email) {
    }

    public void updateUser(int id, String name, String email) {
    }

    public void deleteUser(int id) {
    }
}
