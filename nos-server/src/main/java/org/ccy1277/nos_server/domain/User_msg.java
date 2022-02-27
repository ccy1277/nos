package org.ccy1277.nos_server.domain;

import java.util.Date;

public class User_msg {
    private String id;
    private String username;
    private String sex;
    private Integer age;
    private String email;
    private String area;
    private boolean is_admin;
    private boolean is_writer;
    private boolean is_vip;
    private Date entry_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public boolean isIs_writer() {
        return is_writer;
    }

    public void setIs_writer(boolean is_writer) {
        this.is_writer = is_writer;
    }

    public boolean isIs_vip() {
        return is_vip;
    }

    public void setIs_vip(boolean is_vip) {
        this.is_vip = is_vip;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    @Override
    public String toString() {
        return "User_msg{" +
                "id='" + id + '\'' +
                ", name='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", area='" + area + '\'' +
                ", is_admin=" + is_admin +
                ", is_writer=" + is_writer +
                ", is_vip=" + is_vip +
                ", entry_time=" + entry_time +
                '}';
    }
}
