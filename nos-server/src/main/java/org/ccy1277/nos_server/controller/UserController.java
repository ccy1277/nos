package org.ccy1277.nos_server.controller;

import org.ccy1277.nos_server.domain.ResultInfo;
import org.ccy1277.nos_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private ResultInfo resultInfo;

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo login(String id, String pass){
        if(resultInfo.getData() != null){
            resultInfo.setState(1);
            resultInfo.setInfo("登录成功");
        }else{
            resultInfo.setState(-1);
            resultInfo.setInfo("登录失败");
        }

        return resultInfo;
    }
}
