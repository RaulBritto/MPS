package business.control;

import business.model.Usuario;

public class Print_tipo1 extends Print_Geral {
	public Print_tipo1(Print_Info u){
		super(u);
	}
	public void Salvar(Usuario j){
		Save_Info(j,"1");
		Save_Info(j,"2");
	}
}
