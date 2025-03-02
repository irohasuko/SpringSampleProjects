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
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, userRowMapper);
    }

    // IDでユーザ取得
    public UserEntity findById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        UserEntity user = jdbcTemplate.queryForObject(sql, userRowMapper, id);
        return user;
    }

    // ユーザ登録
    public void save(UserEntity user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
    }

    // ユーザ更新
    public void update(UserEntity user) {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getId());
    }

    // ユーザ削除
    public void deleteById(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}