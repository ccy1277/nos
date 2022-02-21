package org.ccy1277.nos_server.dao;

import org.ccy1277.nos_server.domain.Novel;

import java.util.List;

public interface NovelDao {
    Novel findNovelById(Integer id);
    List<Novel> findAllNovels();
    List<Novel> findNovelsByCat(String title);
    List<Novel> findNovelsByList(String title);
    List<Novel> findNovelsByAuthor(String name);
    List<Novel> findNovelsByEnd();
    List<Novel> findNovelsByBan();
    List<Novel> findNovelsByOk();

    /**
     * 根据name模糊查询小说
     * @param name 小说名关键字
     * @return 相关的小说
     */
    List<Novel> findNovelsByName(String name);
}
