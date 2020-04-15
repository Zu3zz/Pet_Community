package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * Date: 2020/4/13 11:37 上午
 *
 * @author 3zZ.
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
