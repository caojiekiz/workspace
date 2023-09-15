package com.kiz.service;

import com.kiz.domain.User;

import java.util.List;

//用户管理的业务接口
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    /**
     *
     * @param user
     * @return
     */
    User login(User user);

    /**
     *
     * @param user
     */
    void addUser(User user);
    void deleteUser(String id);

    User findUserById(String id);

    void updateUser(User user);
}
