package by.trepam.catalog.command.impl;

import by.trepam.catalog.command.Command;
import by.trepam.catalog.domain.News;
import by.trepam.catalog.domain.Request;
import by.trepam.catalog.domain.Response;
import by.trepam.catalog.service.Service;
import by.trepam.catalog.service.ServiceFactory;
import by.trepam.catalog.service.exception.ServiceException;


public class SaveNewNewsCommand implements Command{

    @Override
    public Response execute(Request request){

        String nameOfNews = request.getNameOfNews();
        String categoryName = request.getCategoryName();
        String subCategoryName = request.getSubCategoryName();
        String provider = request.getAuthor();
        String date = request.getDateOfIssue();
        String body = request.getBody();
        String commandName = request.getCommandName();

        News news = new News(nameOfNews,provider,date,body);

        ServiceFactory factory = ServiceFactory.getInstance();
        Service service = factory.getNewsService();

        Response response = new Response();
        try {
            service.saveNewNews(news,categoryName,subCategoryName,commandName);
            response.setStatus(true);
            response.setMessage("News has been added");
        }catch (ServiceException e){
            response.setStatus(false);
            response.setMessage("News hasn't been added");
            e.printStackTrace();
        }
        return response;
    }

}