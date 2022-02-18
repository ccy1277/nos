package org.ccy1277.nos_server.domain;

import java.util.Date;

public class Notice {
    private Integer notice_id;
    private String notice_from;
    private String notice_to;
    private String content;
    private Date create_time;

    public Integer getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(Integer notice_id) {
        this.notice_id = notice_id;
    }

    public String getNotice_from() {
        return notice_from;
    }

    public void setNotice_from(String notice_from) {
        this.notice_from = notice_from;
    }

    public String getNotice_to() {
        return notice_to;
    }

    public void setNotice_to(String notice_to) {
        this.notice_to = notice_to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "notice_id=" + notice_id +
                ", notice_from='" + notice_from + '\'' +
                ", notice_to='" + notice_to + '\'' +
                ", content='" + content + '\'' +
                ", create_time=" + create_time +
                '}';
    }
}
