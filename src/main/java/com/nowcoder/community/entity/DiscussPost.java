package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * Date: 2020/4/13 11:40 上午
 *
 * @author 3zZ.
 */
@Data
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
