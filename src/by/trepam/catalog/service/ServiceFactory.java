package by.trepam.catalog.service;

public class ServiceFactory {

    private final static ServiceFactory factory = new ServiceFactory();
    Service service = new NewsServiceImpl();

    private ServiceFactory(){

    }

    public static ServiceFactory getInstance(){
        return factory;
    }

    public Service getNewsService(){
        return service;
    }

}