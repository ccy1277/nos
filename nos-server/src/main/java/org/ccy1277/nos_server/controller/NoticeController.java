package org.ccy1277.nos_server.controller;

import org.ccy1277.nos_server.util.ResultInfo;
import org.ccy1277.nos_server.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping(value = "/notices", method = RequestMethod.POST)
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @Autowired
    private ResultInfo resultInfo;

    @RequestMapping(value = "/new" )
    @ResponseBody
    public ResultInfo findNewNotice(){
        resultInfo.setResultInfo(noticeService.findNewestNotice(), "获取最新通知成功","最新通知获取异常");
        return resultInfo;
    }

    @RequestMapping(value = "/all")
    @ResponseBody
    public ResultInfo findAllNotices(){
        resultInfo.setResultInfo(noticeService.findNotices(), "获取通知列表成功","通知列表获取异常");
        return resultInfo;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public ResultInfo addNotice(String from, String to, String content){
        resultInfo.setResultInfo(noticeService.addNotice(from, to, content), "发布通知成功","发布通知出现异常");
        return resultInfo;
    }
}
