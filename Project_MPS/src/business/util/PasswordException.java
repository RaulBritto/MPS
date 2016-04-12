package business.util;

public class PasswordException extends Exception {

	public PasswordException(){
		super("Erro de password");
	}
	public PasswordException(String e){
		super(e);
	}
}
