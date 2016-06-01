package by.trepam.catalog.domain;

public class Response {

    private boolean Status;
    private String message;
    private ListOfNews listOfFoundNews;

    public ListOfNews getListOfFoundNews() {
        return listOfFoundNews;
    }

    public void setListOfFoundNews(ListOfNews listOfFoundNews) {
        this.listOfFoundNews = listOfFoundNews;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}