package com.nowcoder.community.service;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Date: 2020/4/13 11:42 上午
 *
 * @author 3zZ.
 */
public interface DiscussPostService {
    /**
     * 找到所有讨论帖
     * @param userId user主键
     * @param offset 起始偏移量
     * @param limit 每页条数
     * @return 讨论帖集合
     */
    List<DiscussPost> findDiscussPosts(int userId, int offset, int limit);

    /**
     * 找到某个特定用户的所有帖子
     * @param userId 用户主键
     * @return 返回有多少条
     */
    int findDiscussPostRows(int userId);
}
