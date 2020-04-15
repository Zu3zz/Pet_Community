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
     * 通过name寻找用户密码
     * @param username 用户name
     * @return 返回密码
     */
    String selectPasswordByName(String username);
}
