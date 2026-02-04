package customException;

public class WrongInputException extends RuntimeException {
	String message;
	WrongInputException() {
		
	}
	WrongInputException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
