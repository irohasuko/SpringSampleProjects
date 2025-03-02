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
        // 実装前
        return null;
    }

    public UserEntity getUserById(int id) {
        // 実装前
        return null;
    }

    public void createUser(UserEntity user) {
        // 実装前
    }

    public void updateUser(int id, UserEntity updatedUser) {
        // 実装前
    }

    public void deleteUser(int id) {
        // 実装前
    }
}
