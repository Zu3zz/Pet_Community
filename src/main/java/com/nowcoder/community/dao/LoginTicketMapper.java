package com.nowcoder.community.dao;

import com.nowcoder.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

/**
 * Date: 2020/4/20 5:59 下午
 *
 * @author 3zZ.
 */
@Mapper
public interface LoginTicketMapper {

    /**
     * 插入ticket
     *
     * @param loginTicket 需要插入的字段
     * @return 返回是否插入成功
     */
    @Insert({
            "insert into login_ticket(user_id,ticket,status,expired) ",
            "values(#{userId},#{ticket},#{status},#{expired})"
    })
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertLoginTicket(LoginTicket loginTicket);


    /**
     * 通过ticket选择用户
     *
     * @param ticket 传入ticket值
     * @return 具体用户
     */
    @Select({
            "select id, user_id, ticket, status, expired ",
            "from login_ticket where ticket = #{ticket}"
    })
    LoginTicket selectByTicket(String ticket);

    /**
     * 更新状态
     *
     * @param ticket 需要查询的ticket
     * @param status 需要改成什么状态
     * @return 返回是否操作成功
     */
    @Update({
            "<script>",
            "update login_ticket set status = #{status} where ticket = #{ticket} ",
            "<if test=\"ticket!=null\"> ",
            "and 1 = 1 ",
            "</if>",
            "</script>"
    })
    int updateStatus(String ticket, int status);
}
