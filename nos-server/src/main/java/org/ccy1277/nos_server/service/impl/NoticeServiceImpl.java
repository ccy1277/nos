package org.ccy1277.nos_server.service.impl;

import org.ccy1277.nos_server.dao.NoticeDao;
import org.ccy1277.nos_server.domain.Notice;
import org.ccy1277.nos_server.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeDao noticeDao;

    @Override
    public Notice findNewestNotice() {
        return noticeDao.findNewestNotice();
    }

    @Override
    public ArrayList<Notice> findNotices() {
        ArrayList<Notice> notices = (ArrayList<Notice>) noticeDao.findAllNotices();
        return notices.size() > 0 ? notices : null;
    }

    @Override
    public boolean addNotice(String from, String to, String content) {
        Notice notice = new Notice();
        notice.setNotice_from(from);
        notice.setNotice_to(to);
        notice.setContent(content);

        return noticeDao.addNotice(notice);
    }
}
