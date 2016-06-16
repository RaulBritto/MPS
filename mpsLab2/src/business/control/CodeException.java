package business.control;

public class CodeException extends Exception {
	public CodeException(){
		super("Erro no código");
	}
	public CodeException(String e){
		super(e);
	}

}
