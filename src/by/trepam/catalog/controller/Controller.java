package by.trepam.catalog.controller;

import by.trepam.catalog.command.Command;
import by.trepam.catalog.command.CommandHelper;
import by.trepam.catalog.command.exception.CommandException;
import by.trepam.catalog.domain.Request;
import by.trepam.catalog.domain.Response;

public class Controller {

    private CommandHelper commandHelper = new CommandHelper();

    public Response doAction(Request request){

        String commandName = request.getCommandName();
        Command command = null;
        
        try {
            command = commandHelper.getCommand(commandName);
        } catch (CommandException e) {
            e.printStackTrace();
        }
        
        Response response = command.execute(request);
        return response;
    }
}