package org.ccy1277.nos_server.service;

import org.ccy1277.nos_server.domain.User_msg;

import java.util.List;

public interface UserMsgService {
    public List<User_msg> findUsersByKeyName(String keyName);

    public List<User_msg> findUsersByTotal(String total);

    public User_msg findUserById(String id);
}
