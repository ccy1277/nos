package org.ccy1277.nos_server.controller;

import org.ccy1277.nos_server.util.ResultInfo;
import org.ccy1277.nos_server.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping(value = "novels")
public class NovelController {
    @Autowired
    private NovelService novelService;

    @Autowired
    private ResultInfo resultInfo;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo findAllNovels(){
        resultInfo.setResultInfo(novelService.findAllNovels(), "小说列表获取成功","查找的小说不存在");
        return resultInfo;
    }

    @RequestMapping(value = "/key", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo findNovelsByName(String keyName){
        resultInfo.setResultInfo(novelService.findNovelsByName(keyName), "小说获取成功","查找的小说不存在");
        return resultInfo;
    }
}
