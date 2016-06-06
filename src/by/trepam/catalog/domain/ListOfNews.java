package by.trepam.catalog.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "news")
public class ListOfNews {
    private ArrayList<News> list = new ArrayList<>();

    public ArrayList<News> getList() {
        return list;
    }
    @XmlElement(name = "news")
    public void setList(ArrayList<News> list) {
        this.list = list;
    }

    public void addNews(News news){
        list.add(news);
    }

    public String show() {
        String stringNews = "";
        for (News news : list) {
            stringNews += news.show() + "\n\n";
        }
        return stringNews;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListOfNews news = (ListOfNews) o;

        return !(list != null ? !list.equals(news.list) : news.list != null);

    }

    @Override
    public int hashCode() {
        return list != null ? list.hashCode() : 0;
    }

    @Override
    public String toString() {
    	return getClass().getName() + "@" + "list : " + list;
    }
}