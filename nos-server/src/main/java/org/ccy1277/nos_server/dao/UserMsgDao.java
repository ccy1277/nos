package org.ccy1277.nos_server.dao;

import org.apache.ibatis.annotations.Select;
import org.ccy1277.nos_server.domain.User_msg;

import java.util.List;

public interface UserMsgDao {
    @Select("select * from user_msg where id = #{id}")
    User_msg findUserMsg(String id);
    @Select("select * from user_msg;")
    List<User_msg> findAllUserMsg();
    @Select("select * from user_msg where is_admin = 1")
    List<User_msg> findMessagesByAdmin();
    @Select("select * from user_msg where is_writer = 1")
    List<User_msg> findMessagesByWriter();
    @Select("select * from user_msg where is_vip = 1")
    List<User_msg> findMessagesByVip();
    @Select("select * from user_msg where is_admin = 0 and is_writer = 0 and is_vip = 0")
    List<User_msg> findMessageByCommon();

    /**
     * 根据name模糊查询用户信息
     * @param name 用户名关键字
     * @return 相关的用户
     */
    @Select("select * from user_msg where username like concat('%', #{name}, '%')")
    List<User_msg> findMessageByName(String name);
}
