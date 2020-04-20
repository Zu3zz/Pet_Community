package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Date: 2020/4/13 11:41 上午
 *
 * @author 3zZ.
 */
@Mapper
public interface DiscussPostMapper {
    /**
     * 从数据库里查找所有讨论帖
     * @param userId 为0时不区分特定用户
     * @param offset 分页起始数目
     * @param limit 分页每条显示数目
     * @return 所有讨论帖的集合
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 选取特定的用户讨论帖的数量
     * @param userId 用户id的别名 如果只有一个参数，并且在mybatis中的<if>使用 必须加别名
     * @return 返回数量
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
