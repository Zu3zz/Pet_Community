package com.nowcoder.community.service.impl;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Date: 2020/4/13 11:52 上午
 *
 * @author 3zZ.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

    /**
     * 通过username寻找用户
     *
     * @param username 用户姓名
     * @return 返回用户模型
     */
    @Override
    public User findUserByName(String username) {
        return userMapper.selectByName(username);
    }

    /**
     * 验证用户是否可以登录
     *
     * @param username 姓名
     * @param password 密码
     * @return 返回登录是否成功
     */
    @Override
    public boolean userLogin(String username, String password) {
        return password.equals(userMapper.selectPasswordByName(username));
    }
}
