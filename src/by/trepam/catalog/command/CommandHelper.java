package by.trepam.catalog.command;

import by.trepam.catalog.command.exception.CommandException;
import by.trepam.catalog.command.impl.FindNewsCommand;
import by.trepam.catalog.command.impl.SaveNewNewsCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper{

    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandHelper(){

        commands.put(CommandName.SAVE_NEW_NEWS, new SaveNewNewsCommand());
        commands.put(CommandName.FIND_NEWS, new FindNewsCommand());

    }

    public Command getCommand(String name) throws CommandException {
        CommandName commandName;
        try {
             commandName = CommandName.valueOf(name.toUpperCase().replace(" ", "_"));
        }catch (Exception e){
            throw new CommandException("Wrong command",e);
        }
        return commands.get(commandName);

    }
}