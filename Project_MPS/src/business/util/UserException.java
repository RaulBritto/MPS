package business.util;

public class UserException extends Exception {
	public UserException(){
		super("Erro de Login");
	}
	public UserException(String e){
		super(e);
	}
	
}
