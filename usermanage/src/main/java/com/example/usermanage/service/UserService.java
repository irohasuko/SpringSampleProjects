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
        return userRepository.findAll();
    }

    public UserEntity getUserById(int id) {
        return userRepository.findById(id);
    }

    public void createUser(UserEntity user) {
        userRepository.save(user);
    }

    public void updateUser(int id, UserEntity updatedUser) {
        userRepository.update(id, updatedUser);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
