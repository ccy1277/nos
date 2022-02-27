package org.ccy1277.nos_server.controller;

import org.ccy1277.nos_server.domain.ResultInfo;
import org.ccy1277.nos_server.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "novels")
public class NovelController {
    @Autowired
    private NovelService novelService;

    @Autowired
    private ResultInfo resultInfo;

    @RequestMapping(value = "/all")
    @ResponseBody
    public ResultInfo findAllNovels(){
        resultInfo.setData(novelService.findAllNovels());
        if(resultInfo.getData() != null){
            resultInfo.setState(1);
            resultInfo.setInfo("小说列表获取成功");
        }else{
            resultInfo.setState(-1);
            resultInfo.setInfo("小说列表获取异常");
        }

        return resultInfo;
    }

    @RequestMapping(value = "/key")
    @ResponseBody
    public ResultInfo findNovelsByName(String keyName){
        resultInfo.setData(novelService.findNovelsByName(keyName));
        if(resultInfo.getData() != null){
            resultInfo.setState(1);
            resultInfo.setInfo("小说获取成功");
        }else{
            resultInfo.setState(-1);
            resultInfo.setInfo("小说获取异常");
        }

        return resultInfo;
    }
}
