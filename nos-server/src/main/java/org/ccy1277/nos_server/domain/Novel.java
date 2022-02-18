package org.ccy1277.nos_server.domain;

import java.util.Date;

public class Novel {
    private Integer id;
    private String novel_name;
    private String novel_icon;
    private Date update_time;
    private String list_title;
    private String cat_title;
    private String author_name;
    private String introduction;
    private boolean is_end;
    private boolean is_ban;
    private boolean is_ok;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNovel_name() {
        return novel_name;
    }

    public void setNovel_name(String novel_name) {
        this.novel_name = novel_name;
    }

    public String getNovel_icon() {
        return novel_icon;
    }

    public void setNovel_icon(String novel_icon) {
        this.novel_icon = novel_icon;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getList_title() {
        return list_title;
    }

    public void setList_title(String list_title) {
        this.list_title = list_title;
    }

    public String getCat_title() {
        return cat_title;
    }

    public void setCat_title(String cat_title) {
        this.cat_title = cat_title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public boolean isIs_end() {
        return is_end;
    }

    public void setIs_end(boolean is_end) {
        this.is_end = is_end;
    }

    public boolean isIs_ban() {
        return is_ban;
    }

    public void setIs_ban(boolean is_ban) {
        this.is_ban = is_ban;
    }

    public boolean isIs_ok() {
        return is_ok;
    }

    public void setIs_ok(boolean is_ok) {
        this.is_ok = is_ok;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "id=" + id +
                ", novel_name='" + novel_name + '\'' +
                ", novel_icon='" + novel_icon + '\'' +
                ", update_time=" + update_time +
                ", list_title='" + list_title + '\'' +
                ", cat_title='" + cat_title + '\'' +
                ", author_name='" + author_name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", is_end=" + is_end +
                ", is_ban=" + is_ban +
                ", is_ok=" + is_ok +
                '}';
    }
}
