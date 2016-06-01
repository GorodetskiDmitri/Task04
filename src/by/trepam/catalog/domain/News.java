package by.trepam.catalog.domain;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "news")
@XmlType(propOrder = {"name", "author", "dateOfIssue", "body"})
public class News {

    private String name;
    private String author;
    private String dateOfIssue;
    private String body;

    public News(){

    }

    public News(String name, String author, String dateOfIssue, String body) {
        this.name = name;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    @XmlElement(name = "author")
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return dateOfIssue;
    }

    @XmlElement(name = "dateOfIssue")
    public void setDate(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getBody() {
        return body;
    }

    @XmlElement(name = "body")
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Новость: " + name + "\n" + "Автор: " + author + "\n" + "Дата: " + dateOfIssue + "\n" + body;

    }
}