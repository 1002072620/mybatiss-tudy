package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-03-22 19:39
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //插入一个用户
    int addUser(User user);

}
