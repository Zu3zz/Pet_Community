package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * Date: 2020/5/26 4:52 下午
 *
 * @author 3zZ.
 */
@Data
public class Comment {
    private int id;
    private int userId;
    private int entityType;
    private int entityId;
    private int targetId;
    private String content;
    private int status;
    private Date createTime;
}
