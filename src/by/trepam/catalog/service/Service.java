package by.trepam.catalog.service;

import by.trepam.catalog.domain.Criterion;
import by.trepam.catalog.domain.ListOfNews;
import by.trepam.catalog.domain.News;
import by.trepam.catalog.service.exception.ServiceException;


public interface Service {

    void saveNewNews(News news, String categoryName, String subCategoryName,String commandName) throws ServiceException;

    ListOfNews findNews(Criterion criterion, String commandName) throws ServiceException;
}