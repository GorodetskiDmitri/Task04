package by.trepam.catalog.command.impl;

import by.trepam.catalog.command.Command;
import by.trepam.catalog.domain.Criterion;
import by.trepam.catalog.domain.ListOfNews;
import by.trepam.catalog.domain.Request;
import by.trepam.catalog.domain.Response;
import by.trepam.catalog.service.Service;
import by.trepam.catalog.service.ServiceFactory;
import by.trepam.catalog.service.exception.ServiceException;

public class FindNewsCommand implements Command {

    @Override
    public Response execute(Request request){

        String nameOfNews = request.getNameOfNews();
        String body = request.getBody();
        String commandName = request.getCommandName();
        
        Criterion criterion = new Criterion(nameOfNews, body);

        ServiceFactory factory = ServiceFactory.getInstance();
        Service service = factory.getNewsService();

        Response response = new Response();
        try {
            ListOfNews listOfFoundNews = service.findNews(criterion, commandName);
            response.setListOfFoundNews(listOfFoundNews);
            response.setStatus(true);
            response.setMessage("News has been found" + "\n");
        }catch (ServiceException e){
            response.setStatus(false);
            response.setMessage("News wasn't been found" + "\n");
        }

        return response;
    }

}