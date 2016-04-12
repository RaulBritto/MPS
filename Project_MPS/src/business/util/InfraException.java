package business.util;

public class InfraException extends Exception {
	
	public InfraException() {	
		super("Erro de arquivo");
	}
	public InfraException(String message) {
		super(message);
	}
}
