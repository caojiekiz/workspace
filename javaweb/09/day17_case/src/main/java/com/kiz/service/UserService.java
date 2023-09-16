package com.kiz.service;

import com.kiz.domain.PageBean;
import com.kiz.domain.User;

import java.util.List;
import java.util.Map;

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

    void delSelectedUser(String[] ids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition 条件查询参数
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
