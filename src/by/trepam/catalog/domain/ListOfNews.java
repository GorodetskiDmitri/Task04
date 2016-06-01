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

    @Override
    public String toString() {
        String stringNews="";
        for(News news : list){
            stringNews += news.toString() + "\n\n";
        }
        return stringNews;
    }
}