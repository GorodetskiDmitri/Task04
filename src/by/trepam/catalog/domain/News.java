package by.trepam.catalog.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;;

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

    public String show() {
        return "Новость: " + name + "\n" + "Автор: " + author + "\n" + "Дата: " + dateOfIssue + "\n" + body;

    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (name != null ? !name.equals(news.name) : news.name != null) return false;
        if (author != null ? !author.equals(news.author) : news.author != null) return false;
        if (dateOfIssue != null ? !dateOfIssue.equals(news.dateOfIssue) : news.dateOfIssue != null) return false;
        return !(body != null ? !body.equals(news.body) : news.body != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (dateOfIssue != null ? dateOfIssue.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
    	return getClass().getName() + "@" + "nameo : " + name + 
    			", author : " + author +
    			", dateOfIssue : " + dateOfIssue +
    			", body : " + body;
    }
}