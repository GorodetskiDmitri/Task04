package by.trepam.catalog.domain;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "subcategory")
public class SubCategory {

    private List<News> list;
    private String name;

    public SubCategory(){

    }

    public SubCategory(String name, List<News> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<News> getListOfNews() {
        return list;
    }

    @XmlElement(name = "news")
    public void setListOfNews(List<News> list) {
        this.list = list;
    }


}