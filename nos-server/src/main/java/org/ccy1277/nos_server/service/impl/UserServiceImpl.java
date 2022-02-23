package org.ccy1277.nos_server.service.impl;

import org.ccy1277.nos_server.dao.UserDao;
import org.ccy1277.nos_server.domain.User;
import org.ccy1277.nos_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User Login(String id, String pwd) {
        User user = userDao.findUser(id);
        if(user != null && Arrays.equals(user.getPwd(), pwd.getBytes())){
            return user;
        }else{
            return null;
        }
    }
}
