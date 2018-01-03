package com.goodwill.dao;

import com.goodwill.domain.User;

public interface UserDao {
    public abstract User findByUsername(String username);
}