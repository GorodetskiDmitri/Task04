package by.trepam.catalog.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "news")
public class ListOfNews {
	@XmlElement(name = "news")
    private ArrayList<News> listOfNews = new ArrayList<>();
    
    public ListOfNews() {
    	
    }

    public ArrayList<News> getList() {
        return listOfNews;
    }
    
    public void setList(ArrayList<News> list) {
        this.listOfNews = list;
    }

    public void addNews(News news){
        listOfNews.add(news);
    }

    public String show() {
        String stringNews = "";
        for (News news : listOfNews) {
            stringNews += news.show() + "\n\n";
        }
        return stringNews;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListOfNews news = (ListOfNews) o;

        return !(listOfNews != null ? !listOfNews.equals(news.listOfNews) : news.listOfNews != null);

    }

    @Override
    public int hashCode() {
        return listOfNews != null ? listOfNews.hashCode() : 0;
    }

    @Override
    public String toString() {
    	return getClass().getName() + "@" + "listOfNews : " + listOfNews;
    }
}