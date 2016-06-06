package by.trepam.catalog.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

@XmlRootElement(name = "category")
public class Category {
    
	@XmlElement(name = "subcategory")
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


    public void setSubCategoryList(List<SubCategory> list) {
        this.list = list;
    }

    public void addSubCategory(SubCategory subCategory){
        list.add(subCategory);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return !(list != null ? !list.equals(category.list) : category.list != null);

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