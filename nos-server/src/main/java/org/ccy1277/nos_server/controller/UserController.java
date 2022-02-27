package org.ccy1277.nos_server.controller;

import org.ccy1277.nos_server.util.ResultInfo;
import org.ccy1277.nos_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserController {
    @Autowired
    private ResultInfo resultInfo;

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo login(String username, String pass){
        resultInfo.setResultInfo(userService.Login(username, pass), "登录成功","登录失败");
        return resultInfo;
    }
}
