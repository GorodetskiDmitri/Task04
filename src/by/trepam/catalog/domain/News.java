package by.trepam.catalog.domain;

import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "News", propOrder = {"name", "author", "dateOfIssue", "body"})
public class News {

	@XmlElement(required = true)
    private String name;
	
	@XmlElement(required = true)
    private String author;
	
	@XmlElement(required = true)
    private String dateOfIssue;
	
	@XmlElement(required = true)
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return dateOfIssue;
    }

    public void setDate(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Новость: " + name + "\n" + "Автор: " + author + "\n" + "Дата: " + dateOfIssue + "\n" + body;

    }
}