package com.kiz.dao;

import com.kiz.domain.User;

import java.util.List;

/**
 * 用户操作dao
 */
public interface UserDao {
    public List<User> findAll();
    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);
    void delete(int id);

    User findById(int id);
    void update(User user);
}
