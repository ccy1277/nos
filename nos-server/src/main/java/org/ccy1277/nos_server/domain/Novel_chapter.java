package org.ccy1277.nos_server.domain;

public class Novel_chapter {
    private Integer chap_id;
    private Integer novel_id;
    private String title;
    private String content;

    public Integer getChap_id() {
        return chap_id;
    }

    public void setChap_id(Integer chap_id) {
        this.chap_id = chap_id;
    }

    public Integer getNovel_id() {
        return novel_id;
    }

    public void setNovel_id(Integer novel_id) {
        this.novel_id = novel_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Novel_chapter{" +
                "chap_id=" + chap_id +
                ", novel_id=" + novel_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
