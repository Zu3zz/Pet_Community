package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Date: 2020/4/13 11:36 上午
 *
 * @author 3zZ.
 */
@Mapper
public interface UserMapper {
    /**
     * 通过用户id寻找用户
     * @param id 用户主键
     * @return 返回用户模型
     */
    User selectById(int id);

    /**
     * 通过name寻找用户
     * @param username 用户name
     * @return 返回用户模型
     */
    User selectByName(String username);

    /**
     * 通过邮箱查找用户
     * @param email 邮箱名
     * @return 返回用户模型
     */
    User selectByEmail(String email);

    /**
     * 通过name寻找用户密码
     * @param username 用户name
     * @return 返回密码
     */
    String selectPasswordByName(String username);

    /**
     * 添加一个用户的信息
     * @param user 传入用户模型
     */
    int insertUser(User user);

    /**
     * 更改用户的登录状态
     * @param id 用户id
     * @param status 用户状态
     * @return 返回是否操作成功
     */
    int updateStatus(int id, int status);

    /**
     * 更新用户头像
     * @param id 用户id
     * @param headerUrl 用户的新头像链接
     * @return 返回是否操作成功
     */
    int updateHeader(int id, String headerUrl);

    /**
     * 更新用户的密码
     * @param id 用户id
     * @param password 用户的新密码
     * @return 是否操作成功
     */
    int updatepassword(int id, String password);
}
