package org.ccy1277.nos_server.dao;

import org.ccy1277.nos_server.domain.Notice;

import java.util.List;

public interface NoticeDao {
    List<Notice> findAllNotices();
    Notice findNoticeById(Integer id);
    boolean addNotice(Notice notice);
}
