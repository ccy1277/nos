package org.ccy1277.nos_server.service;

import org.ccy1277.nos_server.domain.User;

public interface UserService {
    public User Login(String id, String pwd);
}
