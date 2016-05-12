package business.control;

public class PasswordException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PasswordException(){
		super("Erro de password");
	}
	public PasswordException(String e){
		super(e);
	}
}