package org.ccy1277.nos_server.service.impl;

import org.ccy1277.nos_server.dao.UserMsgDao;
import org.ccy1277.nos_server.domain.User_msg;
import org.ccy1277.nos_server.service.UserMsgService;
import org.ccy1277.nos_server.util.FindTotalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserMsgServiceImpl implements UserMsgService {
    @Autowired
    private UserMsgDao userMsgDao;

    @Override
    public List<User_msg> findUsersByKeyName(String keyName) {
        List<User_msg> userMsgs = userMsgDao.findMessageByName(keyName);
        return userMsgs.size() > 0 ? userMsgs: null;
    }

    @Override
    public List<User_msg> findUsersByTotal(String total) {
        List<User_msg> userMsgs = new ArrayList<>();
        switch (FindTotalType.getTotalType(total)){
            case all: userMsgs = userMsgDao.findAllUserMsg(); break;
            case admin: userMsgs = userMsgDao.findMessagesByAdmin(); break;
            case vip: userMsgs = userMsgDao.findMessagesByVip(); break;
            case writer: userMsgs = userMsgDao.findMessagesByWriter(); break;
            case common: userMsgs = userMsgDao.findMessageByCommon(); break;
        }

        return userMsgs.size() > 0 ? userMsgs: null;
    }

    @Override
    public User_msg findUserById(String id) {
        return userMsgDao.findUserMsg(id);
    }

}
