package by.trepam.catalog.dao;

public class DAOFactory {

    private final static DAOFactory factory = new DAOFactory();
    private NewsDAO newsDAO = new NewsDAOImpl();

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        return factory;
    }

    public NewsDAO getNewsDAO(){
        return newsDAO;
    }

}