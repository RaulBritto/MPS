package business.control;

import business.model.*;
public class SigaaAdapter {
	public SigaaNew sigaa;
	
	public SigaaAdapter(){
		sigaa = new SigaaNew();
	}
	public void confirma_Mat(String matricula, String name){
		int mat = Integer.parseInt(matricula);
		sigaa.existeMatricula(mat, name);
	}
	
	
}
