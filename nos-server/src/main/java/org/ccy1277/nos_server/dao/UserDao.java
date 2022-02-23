package org.ccy1277.nos_server.dao;

import org.apache.ibatis.annotations.Select;
import org.ccy1277.nos_server.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select id, decode(pwd, 'encry') as pwd, token from user where id = #{id}")
    User findUser(String id);
}
