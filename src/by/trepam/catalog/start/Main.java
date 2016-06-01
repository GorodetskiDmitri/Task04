package by.trepam.catalog.start;

import by.trepam.catalog.controller.Controller;
import by.trepam.catalog.domain.Request;
import by.trepam.catalog.domain.Response;
import by.trepam.catalog.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View();
        Request request = view.doUserActionFind();
        //Request request = view.doUserActionSave();
        Response response = controller.doAction(request);
        view.printMessage(response);
    }
}