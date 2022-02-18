package org.ccy1277.nos_server.domain;

import java.util.Date;

public class Transaction {
    private Integer id;
    private String user_id;
    private Integer novel_id;
    private Integer mon_ticket;
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getNovel_id() {
        return novel_id;
    }

    public void setNovel_id(Integer novel_id) {
        this.novel_id = novel_id;
    }

    public Integer getMon_ticket() {
        return mon_ticket;
    }

    public void setMon_ticket(Integer mon_ticket) {
        this.mon_ticket = mon_ticket;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", novel_id=" + novel_id +
                ", mon_ticket=" + mon_ticket +
                ", time=" + time +
                '}';
    }
}
