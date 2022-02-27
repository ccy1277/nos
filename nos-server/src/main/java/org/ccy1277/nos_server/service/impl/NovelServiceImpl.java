package org.ccy1277.nos_server.service.impl;

import org.ccy1277.nos_server.dao.NovelDao;
import org.ccy1277.nos_server.domain.Novel;
import org.ccy1277.nos_server.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NovelServiceImpl implements NovelService {
    @Autowired
    private NovelDao novelDao;

    @Override
    public List<Novel> findAllNovels() {
        ArrayList<Novel> novels = (ArrayList<Novel>) novelDao.findAllNovels();

        return novels.size() > 0 ? novels : null;
    }

    @Override
    public List<Novel> findNovelsByName(String name) {
        ArrayList<Novel> novels = (ArrayList<Novel>) novelDao.findNovelsByName(name);

        return novels.size() > 0 ? novels : null;
    }
}
