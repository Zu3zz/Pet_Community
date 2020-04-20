package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * Date: 2020/4/16 9:57 上午
 *
 * @author 3zZ.
 */
public class CommunityUtil {
    /**
     * 生成随机字符串工具类
     * @return 返回随机字符串
     */
    public static String generateUuid(){
       return UUID.randomUUID().toString().replaceAll("-","");
    }

    /**
     * 通过密码+salt的形式 生成密码 防止被暴力破解
     * @param key 传入的密码
     * @return 返回加密之后的密文
     */
    public static String md5WithSalt(String key){
        if(StringUtils.isBlank(key)){
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}
