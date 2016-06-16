package business.control;

import business.model.Usuario;

public abstract class Print_Geral {
	protected Print_Info PI;
	
	public Print_Geral(Print_Info u){
		PI = u;
	}
	public void Save_Info(Usuario u ,String a){
		PI.save_Info(u,a);
	}
	public abstract void Salvar(Usuario j);
}
