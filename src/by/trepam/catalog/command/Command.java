package by.trepam.catalog.command;

import by.trepam.catalog.domain.Request;
import by.trepam.catalog.domain.Response;

public interface Command {

    Response execute(Request request);

}