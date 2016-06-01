package by.trepam.catalog.view;

import by.trepam.catalog.domain.Request;
import by.trepam.catalog.domain.Response;


public class View {

    public Request doUserActionSave(){

        Request request = new Request();
        request.setCommandName("Save new news");
        request.setCategoryName("disk");
        request.setSubCategoryName("metal");
        request.setNameOfNews("Damned In Black");
        request.setAuthor("IMMORTAL");
        request.setDate("2006-02-17");
        request.setBody("release CD");
        
        return request;
    }

    public Request doUserActionFind(){

        Request request = new Request();
        request.setCommandName("Find News");
        request.setBody("Master");
        request.setNameOfNews("In the");

        return request;
    }

    public void printMessage(Response response){

        System.out.println(response.getMessage());
        if(response.getListOfFoundNews()!=null){
            System.out.println(response.getListOfFoundNews().toString());
        }
    }
}