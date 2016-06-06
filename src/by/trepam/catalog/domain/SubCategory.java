package by.trepam.catalog.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubCategory subCategory = (SubCategory) o;

        if (name != null ? !name.equals(subCategory.name) : subCategory.name != null) return false;
        return !(list != null ? !list.equals(subCategory.list) : subCategory.list != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (list != null ? list.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
    	return getClass().getName() + "@" + "name : " + name + ", list : " + list;
    }

}