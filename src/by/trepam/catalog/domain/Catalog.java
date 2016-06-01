package by.trepam.catalog.domain;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "catalog")
public class Catalog {

    private List<Category> list;

    public Catalog(){

    }

    public Catalog(List<Category> list) {
        this.list = list;
    }

    public List<Category> getListOfCategory() {
        return list;
    }

    @XmlElement(name = "category")
    public void setListOfCategory(List<Category> list) {
        this.list = list;
    }

}