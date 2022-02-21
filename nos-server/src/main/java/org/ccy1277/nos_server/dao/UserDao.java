package org.ccy1277.nos_server.dao;

import org.ccy1277.nos_server.domain.User;

public interface UserDao {
    User findUser(String id);
}
