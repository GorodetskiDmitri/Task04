package by.trepam.catalog.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlRootElement(name = "catalog")
public class Catalog {

    @XmlElement(name = "category")
    private List<Category> list;

    public Catalog(){

    }

    public Catalog(List<Category> list) {
        this.list = list;
    }

    public List<Category> getListOfCategory() {
        return list;
    }

    public void setListOfCategory(List<Category> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Catalog catalog = (Catalog) o;

        return !(list != null ? !list.equals(catalog.list) : catalog.list != null);

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