package com.nowcoder.community.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.Map;
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
    public static String getJsonString(int code, String msg, Map<String, Object> map){
        JSONObject json = new JSONObject();
        json.put("code", code);
        json.put("msg",msg);
        if(map != null){
            for (String key: map.keySet()){
                json.put(key, map.get(key));
            }
        }
        return json.toJSONString();
    }
    public static String getJsonString(int code, String msg){
        return getJsonString(code, msg, null);
    }
    public static String getJsonString(int code){
        return getJsonString(code, null,null);
    }
}
