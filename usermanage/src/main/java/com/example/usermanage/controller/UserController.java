package com.example.usermanage.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.usermanage.entity.UserEntity;
import com.example.usermanage.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ユーザ一覧
    @GetMapping
    public String listUsers(Model model) {
        // 実装前
        return null;
    }

    // ユーザ詳細
    @GetMapping("/{id}")
    public String userDetail(@PathVariable int id, Model model) {
        // 実装前
        return null;
    }

    // ユーザ追加画面
    @GetMapping("/create")
    public String createUserForm(Model model) {
        // 実装前
        return null;
    }

    // ユーザ追加処理
    @PostMapping("/create")
    public String createUser(@ModelAttribute UserEntity user) {
        // 実装前
        return null;
    }

    // ユーザ更新画面
    @GetMapping("/{id}/edit")
    public String updateUserForm(@PathVariable int id, Model model) {
        // 実装前
        return null;
    }

    // ユーザ更新処理
    @PostMapping("/{id}/edit")
    public String updateUser(@PathVariable int id, @ModelAttribute UserEntity user) {
        // 実装前
        return null;
    }

    // ユーザ削除画面
    @GetMapping("/{id}/delete")
    public String deleteUserForm(@PathVariable int id, Model model) {
        // 実装前
        return null;
    }

    // ユーザ削除処理
    @PostMapping("/{id}/delete")
    public String deleteUser(@PathVariable int id) {
        // 実装前
        return null;
    }
}
