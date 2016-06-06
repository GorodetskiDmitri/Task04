package by.trepam.catalog.service.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -4986880902920034823L;

	public ServiceException(String message){
        super(message);
    }

    public ServiceException(String message, Exception e){
        super(message,e);
    }

}