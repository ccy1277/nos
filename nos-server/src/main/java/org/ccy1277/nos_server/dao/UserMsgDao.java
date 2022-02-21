package org.ccy1277.nos_server.dao;

import org.ccy1277.nos_server.domain.User_msg;

import java.util.List;

public interface UserMsgDao {
    User_msg findUserMsg(String id);
    List<User_msg> findAllUserMsg();
    List<User_msg> findMessagesByAdmin();
    List<User_msg> findMessagesByWriter();
    List<User_msg> findMessagesByVip();

    /**
     * 根据name模糊查询用户信息
     * @param name 用户名关键字
     * @return 相关的用户
     */
    List<User_msg> findMessageByName(String name);
}
