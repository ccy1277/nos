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
@RequestMapping(value = "/notices")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @Autowired
    private ResultInfo resultInfo;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo findNewNotice(){
        resultInfo.setResultInfo(noticeService.findNewestNotice(), "获取最新通知成功","最新通知获取异常");
        return resultInfo;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo findAllNotices(){
        resultInfo.setResultInfo(noticeService.findNotices(), "获取通知列表成功","通知列表获取异常");
        return resultInfo;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addNotice(String from, String to, String content){
        resultInfo.setResultInfo(noticeService.addNotice(from, to, content), "发布通知成功","发布通知出现异常");
        return resultInfo;
    }
}
