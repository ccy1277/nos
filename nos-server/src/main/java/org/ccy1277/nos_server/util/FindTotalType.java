package org.ccy1277.nos_server.util;

public enum FindTotalType {
    /**
     * 工具类
     */

    all, common, vip, writer, admin;

    public static FindTotalType getTotalType(String total){
        return valueOf(total);
    }
}
