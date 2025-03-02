package com.example.springdb.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.springdb.model.User;

public class JdbcUser {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getAllUsers() {
        // Spring JDBCを利用して取得
        String sql = "SELECT ID, NAME FROM NewEmployee";
        List<User> jdbcUsers = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("NAME"));
                return user;
            }
        });

        return jdbcUsers;
    }
}
