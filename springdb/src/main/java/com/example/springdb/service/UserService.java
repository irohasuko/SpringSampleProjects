package com.example.springdb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdb.db.DBOperationExample;
import com.example.springdb.jdbc.JdbcUser;
import com.example.springdb.jpa.JpaUser;
import com.example.springdb.model.User;
import com.example.springdb.mybatis.MybatisUser;

@Service
public class UserService {

    @Autowired
    private JdbcUser jdbcUser;

    @Autowired
    private JpaUser jpaUser;
    
    @Autowired
    private MybatisUser userMapper;
    
    public List<User> getAllUsers() {
        List<User> userList;

        // DBOperationExampleクラスを利用して取得
        userList = new DBOperationExample().fetchUser();

        // Spring JDBCを利用して取得

        // Spring JPAを利用して取得

        // MyBatisを利用して取得
        userList = userMapper.findAll();

        return userList;
    }
}
