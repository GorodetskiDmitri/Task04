package by.trepam.catalog.dao;

import by.trepam.catalog.dao.exception.DAOException;
import by.trepam.catalog.domain.Criterion;
import by.trepam.catalog.domain.ListOfNews;
import by.trepam.catalog.domain.News;


public interface NewsDAO {

    void saveNews(News news, String categoryName, String subCategoryName) throws DAOException;
    ListOfNews findNews(Criterion criterion) throws DAOException;

}
