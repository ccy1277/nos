package org.ccy1277.nos_server.controller;

import org.ccy1277.nos_server.util.ResultInfo;
import org.ccy1277.nos_server.service.UserMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/users")
public class UserMsgController {
    @Autowired
    private ResultInfo resultInfo;

    @Autowired
    private UserMsgService userMsgService;

    @RequestMapping(value = "/key")
    @ResponseBody
    public ResultInfo findUsersByKeyName(String keyName){
        resultInfo.setResultInfo(userMsgService.findUsersByKeyName(keyName), "获取用户信息成功","查找的用户不存在");
        return resultInfo;
    }

    @RequestMapping(value = "/total")
    @ResponseBody
    public ResultInfo findUsersByTotal(String total){
        resultInfo.setResultInfo(userMsgService.findUsersByTotal(total), "获取用户信息成功","查找的用户不存在");
        return resultInfo;
    }

    @RequestMapping(value = "/id")
    @ResponseBody
    public ResultInfo findUserById(String id){
        resultInfo.setResultInfo(userMsgService.findUserById(id), "获取用户信息成功","查找的用户不存在");
        return resultInfo;
    }
}
