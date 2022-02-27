package org.ccy1277.nos_server.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.ccy1277.nos_server.domain.Notice;

import java.util.List;

public interface NoticeDao {
    @Select("select * from notice order by create_time desc")
    List<Notice> findAllNotices();
    @Select("select * from notice where create_time = (select max(create_time) from notice)")
    Notice findNewestNotice();
    @Insert("insert into notice(notice_from, notice_to, content)" +
            "values(#{notice_from},#{notice_to},#{content})")
    boolean addNotice(Notice notice);
}
