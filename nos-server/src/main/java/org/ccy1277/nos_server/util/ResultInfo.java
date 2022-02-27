package org.ccy1277.nos_server.util;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class ResultInfo implements Serializable {
    private static final long serialVersionUID = 4132449444109235639L;

    private Integer state;  // 1:success -1:error
    private Object data;
    private String info;

    public void setResultInfo(Object data, Integer state, String success_info, String error_info){
        this.data = data;
        this.state = state;

        if(state == 1){
            this.info = success_info;
        }else{
            this.info = error_info;
        }
    }

    public void setResultInfo(Object data, String success_info, String error_info){
        this.data = data;
        if(data == null){
            this.state = -1;
            this.info = error_info;
        }else{
            this.state = 1;
            this.info = success_info;
        }
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
