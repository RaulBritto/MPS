package business.control;

public class CodeException extends Exception {
	public CodeException(){
		super("Erro no c�digo");
	}
	public CodeException(String e){
		super(e);
	}

}
