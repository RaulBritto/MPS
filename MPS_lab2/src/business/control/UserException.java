package business.control;

public class UserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserException(){
		super("Erro de Login");
	}
	public UserException(String e){
		super(e);
	}
	
}