package excepciones;

public class IncorrectLengthException extends Exception {

	public IncorrectLengthException(String sms) {
		super(sms);
		
	}
}
