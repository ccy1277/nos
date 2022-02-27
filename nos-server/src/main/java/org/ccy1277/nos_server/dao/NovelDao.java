package org.ccy1277.nos_server.dao;

import org.apache.ibatis.annotations.Select;
import org.ccy1277.nos_server.domain.Novel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NovelDao {
    @Select("select * from novel where novel_id = #{id}")
    Novel findNovelById(Integer id);
    @Select("select * from novel;")
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
    @Select("select * from novel where novel_name like concat('%', #{name}, '%')")
    List<Novel> findNovelsByName(String name);

}
