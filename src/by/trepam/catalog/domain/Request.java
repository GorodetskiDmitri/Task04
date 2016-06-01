package by.trepam.catalog.domain;

public class Request {

    private String nameOfNews;
    private String categoryName;
    private String subCategoryName;
    private String author;
    private String dateOfIssue;
    private String body;
    private String commandName;

    public Request() {

    }

    public Request(String nameOfNews, String categoryName, String subCategoryName, String author, String dateOfIssue, String body, String commandName) {
        this.nameOfNews = nameOfNews;
        this.categoryName = categoryName;
        this.subCategoryName = subCategoryName;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
        this.body = body;
        this.commandName = commandName;
    }

    public String getNameOfNews() {
        return nameOfNews;
    }

    public void setNameOfNews(String nameOfNews) {
        this.nameOfNews = nameOfNews;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfIssue() {
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

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
}