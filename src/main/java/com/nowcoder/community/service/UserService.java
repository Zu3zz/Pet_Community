package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Date: 2020/4/13 11:41 上午
 *
 * @author 3zZ.
 */
public interface UserService {
    /**
     * 通过id寻找用户
     * @param id 用户id
     * @return 返回User模型
     */
    public User findUserById(int id);

    /**
     * 通过name寻找用户
     * @param name 用户姓名
     * @return 返回用户模型
     */
    public User findUserByName(String name);

    /**
     * 验证用户是否可以登录
     * @param name 姓名
     * @param password 密码
     * @return 返回用户密码
     */
    public boolean userLogin(String name, String password);
}
