package capgeminipractice;

public class NameInvalidException extends Exception{
	private String message;
	NameInvalidException( String message)
	{
		this.message=message;
	}
	public String getMessage(){
		return this.message;
	}

}
