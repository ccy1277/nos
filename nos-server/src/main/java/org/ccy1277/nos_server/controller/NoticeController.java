package org.ccy1277.nos_server.controller;

import org.ccy1277.nos_server.domain.ResultInfo;
import org.ccy1277.nos_server.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/notices")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @Autowired
    private ResultInfo resultInfo;

    @RequestMapping(value = "/new")
    @ResponseBody
    public ResultInfo findNewNotice(){
        resultInfo.setData(noticeService.findNewestNotice());

        if(resultInfo.getData() != null){
            resultInfo.setState(1);
            resultInfo.setInfo("获取最新通知成功");
        }else{
            resultInfo.setState(-1);
            resultInfo.setInfo("最新通知获取异常");
        }

        return resultInfo;
    }

    @RequestMapping(value = "/all")
    @ResponseBody
    public ResultInfo findAllNotices(){
        resultInfo.setData(noticeService.findNotices());

        if(resultInfo.getData() != null){
            resultInfo.setState(1);
            resultInfo.setInfo("获取通知列表成功");
        }else{
            resultInfo.setState(-1);
            resultInfo.setInfo("通知列表获取异常");
        }

        return resultInfo;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public ResultInfo addNotice(String from, String to, String content){
        resultInfo.setData(noticeService.addNotice(from, to, content));

        if(resultInfo.getData() != null){
            resultInfo.setState(1);
            resultInfo.setInfo("发布通知成功");
        }else{
            resultInfo.setState(-1);
            resultInfo.setInfo("发布通知出现异常");
        }

        return resultInfo;
    }
}
