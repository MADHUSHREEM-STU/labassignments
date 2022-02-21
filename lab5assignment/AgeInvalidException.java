package capgeminipractice;

class AgeInvalidException extends Exception {
 private String message;
 AgeInvalidException(String message)
 {
	 this.message=message;
 }
 public String getMessage(){
	return this.message;
	 
 }
}
