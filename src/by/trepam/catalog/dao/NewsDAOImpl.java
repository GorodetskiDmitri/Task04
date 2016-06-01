package by.trepam.catalog.dao;

import by.trepam.catalog.dao.exception.DAOException;
import by.trepam.catalog.domain.*;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class NewsDAOImpl implements NewsDAO {

    public void saveNews(News news, String categoryName, String subCategoryName) throws DAOException {

        try {
            Catalog catalog = getCatalog();
            catalog = addNews(news, categoryName, subCategoryName, catalog);
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            marshaller.marshal(catalog, new FileOutputStream("resources/catalogSave.xml"));
            marshaller.marshal(catalog,System.out);

        }catch (Exception e){
            throw new DAOException("Error of saving",e);
        }
    }

    public Catalog addNews(News news, String categoryName, String subCategoryName, Catalog catalog){

        for(Category category : catalog.getListOfCategory()){
            if (category.getName().equals(categoryName)){
                for(SubCategory subCategory : category.getSubCategoryList()){
                    if(subCategory.getName().equals(subCategoryName)){
                        subCategory.getListOfNews().add(news);
                    }
                }
            }
        }
        return catalog;
    }

    public ListOfNews findNews(Criterion criterion) throws DAOException {
        ListOfNews listOfFoundNews;
        try {
            Catalog catalog = getCatalog();
            listOfFoundNews = searchNews(criterion, catalog);
            JAXBContext jaxbContext = JAXBContext.newInstance(ListOfNews.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(listOfFoundNews, new FileOutputStream("resources/catalogFind.xml"));

        }catch (Exception e){
            throw new DAOException("Error of find",e);
        }
        return listOfFoundNews;
    }

    public ListOfNews searchNews(Criterion criterion, Catalog catalog){

        ListOfNews listOfFoundNews = new ListOfNews();

        for (Category category : catalog.getListOfCategory()) {
            for (SubCategory subCategory : category.getSubCategoryList()) {
                for (News news : subCategory.getListOfNews()) {
                    if ((news.getName().contains(criterion.getNameOfNews()) ||
                            news.getBody().contains(criterion.getBody()))) {
                        listOfFoundNews.addNews(news);
                    }
                }
            }
        }
        return listOfFoundNews;
    }

    public Catalog getCatalog() throws DAOException {

        Catalog catalog = null;
        try {
            FileReader reader = new FileReader("resources/catalog.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            
            /*SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File("resources/catalod.xsd"));
            unmarshaller.setSchema(schema);*/
            
            catalog = (Catalog) unmarshaller.unmarshal(reader);
        }catch (Exception e){
            throw new DAOException("Error of reading XML",e);
        }
        return catalog;
    }

}