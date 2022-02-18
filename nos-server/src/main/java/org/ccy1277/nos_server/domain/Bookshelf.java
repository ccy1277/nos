package org.ccy1277.nos_server.domain;

public class Bookshelf {
    private String id;
    private Integer novel_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNovel_id() {
        return novel_id;
    }

    public void setNovel_id(Integer novel_id) {
        this.novel_id = novel_id;
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "id='" + id + '\'' +
                ", novel_id=" + novel_id +
                '}';
    }
}
