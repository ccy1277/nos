package org.ccy1277.nos_server.service;


import org.ccy1277.nos_server.domain.Novel;

import java.util.List;

public interface NovelService {
    public List<Novel> findAllNovels();
    public List<Novel> findNovelsByName(String name);
}
