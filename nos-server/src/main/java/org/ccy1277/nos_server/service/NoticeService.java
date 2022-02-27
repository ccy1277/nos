package org.ccy1277.nos_server.service;

import org.ccy1277.nos_server.domain.Notice;

import java.util.ArrayList;

public interface NoticeService {
    public Notice findNewestNotice();
    public ArrayList<Notice> findNotices();
    public boolean addNotice(String from, String to, String content);
}
