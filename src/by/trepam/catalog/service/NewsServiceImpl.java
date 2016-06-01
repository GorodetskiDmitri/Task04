package by.trepam.catalog.service;

import by.trepam.catalog.command.CommandName;
import by.trepam.catalog.dao.DAOFactory;
import by.trepam.catalog.dao.NewsDAO;
import by.trepam.catalog.dao.exception.DAOException;
import by.trepam.catalog.domain.*;
import by.trepam.catalog.service.exception.ServiceException;


public class NewsServiceImpl implements Service {

    @Override
    public void saveNewNews(News news, String categoryName, String subCategoryName,String commandName) throws ServiceException {

        if(validation(categoryName,subCategoryName)){

            DAOFactory factory = DAOFactory.getInstance();
            NewsDAO newDAO = factory.getNewsDAO();

            try{
                newDAO.saveNews(news, categoryName, subCategoryName);

            }catch(DAOException e){
                throw new ServiceException("Error of saving", e);
            }
        }
    }

    @Override
    public ListOfNews findNews(Criterion criterion,String commandName) throws ServiceException {

            DAOFactory factory = DAOFactory.getInstance();
            NewsDAO newDAO = factory.getNewsDAO();

            try {
                return  newDAO.findNews(criterion);
            } catch (DAOException e) {
                throw new ServiceException("Error of find", e);
            }
    }

    public boolean validation(String categoryName, String subCategoryName) throws ServiceException {

        try {
            switch (Categories.valueOf(categoryName.toUpperCase().replace("-", "_"))) {
                case FILM:
                    switch (Subcategories.valueOf(subCategoryName.toUpperCase().replace("-", "_"))) {
                        case HORROR:
                            return true;
                        case FANTASTIC:
                            return true;
                        default:
                            throw new ServiceException("Wrong request");
                    }
                case DISK:
                    switch (Subcategories.valueOf(subCategoryName.toUpperCase().replace("-", "_"))) {
                        case POP:
                            return true;
                        case METAL:
                            return true;
                        default:
                            throw new ServiceException("Wrong request");
                    }
                case BOOK:
                    switch (Subcategories.valueOf(subCategoryName.toUpperCase().replace("-", "_"))) {
                        case SCIENTIFIC_LITERATURE:
                            return true;
                        case DETECTIVE:
                            return true;
                        default:
                            throw new ServiceException("Wrong request");
                    }
                default:
                    throw new ServiceException("Wrong request");
            }
        }catch (Exception e){
            throw new ServiceException("Wrong request", e);
        }
    }
}