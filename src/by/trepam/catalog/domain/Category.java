package by.trepam.catalog.domain;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "category")
public class Category {
    private List<SubCategory> list;
    private String name;

    public Category(){

    }

    public Category(String name, List<SubCategory> list) {
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


    public List<SubCategory> getSubCategoryList(){
        return list;
    }

    @XmlElement(name = "subcategory")
    public void setSubCategoryList(List<SubCategory> list) {
        this.list = list;
    }

    public void addSubCategory(SubCategory subCategory){
        list.add(subCategory);
    }


}