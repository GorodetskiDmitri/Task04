package by.trepam.catalog.domain;

public class Criterion {

    private String nameOfNews;
    private String body;

    public Criterion(String nameOfNews, String body) {
        this.nameOfNews = nameOfNews;
        this.body = body;
    }

    public String getNameOfNews() {
        return nameOfNews;
    }

    public void setNameOfNews(String nameOfNews) {
        this.nameOfNews = nameOfNews;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}