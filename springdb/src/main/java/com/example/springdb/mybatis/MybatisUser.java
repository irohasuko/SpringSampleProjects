package com.example.springdb.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.springdb.model.User;

@Mapper
public interface MybatisUser {
    @Select("SELECT ID, NAME FROM NewEmployee")
    List<User> findAll();
}