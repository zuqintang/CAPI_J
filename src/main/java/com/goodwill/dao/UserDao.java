package com.goodwill.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.goodwill.domain.User;

public interface UserDao {
    public abstract User findByUsername(String username);
    public abstract Integer createUser(@Param("username")String username,@Param("password")String password,@Param("realname")String realname);
}