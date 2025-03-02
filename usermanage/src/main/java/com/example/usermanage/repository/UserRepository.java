package com.example.usermanage.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.usermanage.entity.UserEntity;

import java.util.List;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // UserオブジェクトをマッピングするRowMapper
    private final RowMapper<UserEntity> userRowMapper = (rs, rowNum) -> {
        UserEntity user = new UserEntity();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        return user;
    };

    // 全ユーザ取得
    public List<UserEntity> findAll() {
        // 実装前
        return null;
    }

    // IDでユーザ取得
    public UserEntity findById(int id) {
        // 実装前
        return null;
    }

    // ユーザ登録
    public void save(UserEntity user) {
        // 実装前
    }

    // ユーザ更新
    public void update(int id, UserEntity user) {
        // 実装前
    }

    // ユーザ削除
    public void deleteById(int id) {
        // 実装前
    }
}