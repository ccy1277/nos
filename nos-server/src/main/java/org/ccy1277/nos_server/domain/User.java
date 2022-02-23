package org.ccy1277.nos_server.domain;

import java.util.Arrays;

public class User {
    private String id;
    private byte[] pwd;
    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getPwd() {
        return pwd;
    }

    public void setPwd(byte[] pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd=" + Arrays.toString(pwd) +
                ", token='" + token + '\'' +
                '}';
    }
}
