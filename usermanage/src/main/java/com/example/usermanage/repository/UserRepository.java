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
        return null;
    };

    // 全ユーザ取得
    public List<UserEntity> findAll() {
        return null;
    }

    // IDでユーザ取得
    public UserEntity findById(int id) {
        return null;
    }

    // ユーザ登録
    public void save(UserEntity user) {
    }

    // ユーザ更新
    public void update(UserEntity user) {
    }

    // ユーザ削除
    public void deleteById(int id) {
    }
}